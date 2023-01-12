$(document).ready(function(e){

    //숫자만 입력
    $("input:text[numOnly]").on("keyup", function() {
        $(this).val($(this).val().replace(/[^0-9]/g,""));
    });

    //천단위마다 콤마 생성 + 숫자만 입력
    $("input:text[addComma]").on("keyup", function() {
        $(this).val($(this).val().replace(/\,/g, '')
            .replace(/[^0-9]/g, "")
            .replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,'));
    });

    //전화번호 자동 하이픈 추가 + 숫자만 입력
   $("input:text[addHyphen]").on("keyup", function() {
        $(this).val($(this).val().replace(/\,/g, '')
            .replace(/[^0-9]/g, "")
            .replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/,"$1-$2-$3")
            .replace("--", "-"));
    });

   //저장시 alert 띄우기
   $("#addOrders").click(function(){
       alert("새 주문이 저장되었습니다");

       // let sizeArray = new Array();
       // $("input:checkbox[name=tomatoSize]:checked").each(function () {
       //     sizeArray.push(this.val());
       // });
       // $("#array").val(sizeArray);
       // console.log(sizeArray);
   });


});
/* End onload*/



/*유배지*/
//천단위마다 콤마 생성 + 숫자만 입력
/*
    $("input:text[addComma]").on("keyup", function() {
        $(this).val($(this).val().replace(/\,/g, '')
            .replace(/[^0-9]/g, "")
            .replace(/\B(?=(\d{3})+(?!\d))/g, ","));
    });
*/
