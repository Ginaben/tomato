$(document).ready(function(e){
    var orderNumChk = 0;
    var orderTxt = '';
    $(".orderNumber").each(function () {
        var rows = $(".orderNumber:contains('" + $(this).text() + "')");
        if (rows.length > 1) { //동일한 rows값이 1개 이상이면 열을 합침
            rows.eq(0).attr("rowspan", rows.length);
            rows.not(":eq(0)").remove();
        }
    });

});