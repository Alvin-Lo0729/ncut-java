function () {
  $(".input_result").val("");
  var t = $("#sAmount").val(),
      a = $("#cRate").val(),
      e = $("#rRate").val(),
      r = $("#sTerm").val();
  return fnc_Validation_IsNumberic(t) ? fnc_Validation_IsNumberic2(a)
      ? fnc_Validation_IsNumberic(e) ? fnc_Validation_IsNumberic2(r) ? -1
          !== a.indexOf(".") && a.toString().split(".")[1].length > 2 ? (alert(
              "客戶利率 最多小數點後兩位!"), $("#cRate").focus(), !1) : -1
          !== e.indexOf(".") && e.toString().split(".")[1].length > 2 ? (alert(
              "實質利率 最多小數點後兩位!"), $("#rRate").focus(), !1) : a > 100 || e
          > 100 ? (alert(" 利率不可大於100!"), !1) : void $.ajax({
            type: "POST",
            url: "CarCal.ashx",
            data: "amount=" + t + "&crate=" + a + "&rrate=" + e + "&term=" + r,
            success: function (t) {
              if ("" == (a = JSON.parse(t)).errmsg) {
                console.log("success");
                var a = JSON.parse(t);
                $("#rPmt").val(a.rPmt), $("#rInt").val(a.rInt), $("#rAmt").val(
                    a.rAmt)
              } else {
                a = JSON.parse(t), alert(a.errmsg)
              }
            },
            error: function (t, a) {
              alert("ajax error")
            }
          }) : (alert("請輸入攤還期數 或 請輸入數字 !!"), $("#sTerm").focus(), !1)
          : (alert("請輸實質利率 或 請輸入大於零數字!!"), $(
              "#rRate").focus(), !1) : (alert(
          "請輸入客戶利率 或 請輸入大於等於零的數字!!"), $(
          "#cRate").focus(), !1) : (alert(
      "請輸入申貸金額 或請輸入大於零數字!!"), $("#sAmount").focus(), !1)
}