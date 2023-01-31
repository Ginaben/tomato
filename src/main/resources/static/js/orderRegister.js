$(document).ready(function(e){
   //저장
/*   $("#addOrders").on("click", function(){

       let tmtPpCd = $("input[name=tmtPpCd]").val();
       let tmtSizeLi = $("input[name=tmtSizeLi]").val();
       let tmtSizeCntLi = $("input[name=tmtSizeCntLi]").val();
       let ordererNm = $("input[name=ordererNm]").val();
       let ordererMobile = $("input[name=ordererMobile]").val();
       let receiverNm = $("input[name=receiverNm]").val();
       let receiverMobile = $("input[name=receiverMobile]").val();
       let receiverZipcode = $("input[name=receiverZipcode]").val();
       let receiverAdr = $("input[name=receiverAdr]").val();
       let receiverDetailAdr = $("input[name=receiverDetailAdr]").val();
       let shipMemo = $("input[name=shipMemo]").val();
       let cashRecptNum = $("input[name=cashRecptNum]").val();
       let depositDt = $("input[name=depositDt]").val();
       let salesPrice = $("input[name=salesPrice]").val();
       let note = $("input[name=note]").val();
       let sentDate = $("input[name=sentDate]").val();
       let deliveryFee = $("input[name=deliveryFee]").val();
       let invoice = $("input[name=invoice]").val();

       $.ajax({
           url: "/order/orderRegister/add" ,
           type: "P0ST",
           contentType:"application/json; charset=utf-8",
           dataType:"json",
           data: JSON.stringify({
               tmtPpCd: tmtPpCd,
               tmtSizeLi: tmtSizeLi,
               tmtSizeCntLi: tmtSizeCntLi,
               ordererNm: ordererNm,
               ordererMobile: ordererMobile,
               receiverNm: receiverNm,
               receiverMobile: receiverMobile,
               receiverZipcode: receiverZipcode,
               receiverAdr: receiverAdr,
               receiverDetailAdr: receiverDetailAdr,
               shipMemo: shipMemo,
               cashRecptNum: cashRecptNum,
               depositDt: depositDt,
               salesPrice: salesPrice,
               note: note,
               sentDate: sentDate,
               deliveryFee: deliveryFee,
               invoice: invoice
           })
       })
           .done(function (data) {
               console.log(data);
               alert("새 주문이 저장되었습니다");
               // location.replace("/order/orderRegister");
           });
   });*/

   $("input[name=tmtSizeLi]").click(function(){

       $("input[name=tmtSizeLi]").each(function(){
           var checked = $(this).is(":checked");

           var str = $(this).attr('id');
           str = str.substring(str.length -1, str.length);

           if(checked){
               $("#tmtSizeCnt" + str).attr("disabled",false);
           } else {
               $("#tmtSizeCnt" + str).attr("disabled",true);
           }
       })
   });

   //토마토 품질 주스 선택시
    $("#tmtJuice").click(function(){
        let sizes = $("input[name=tmtSizeLi]").length;

        for(let i = 0; i < sizes -1; i++ ){
            $("#tmtSizeLi"+i).attr("disabled",true);
            $("#tmtSizeCnt"+i).attr("disabled",true);
        }
    });

    /**
     * 정규식
     */
    //숫자만 입력
    $("input:text[numOnly]").on("keyup", function() {
        $(this).val($(this).val().replace(/[^0-9]/g,""));
    });

    //천단위마다 콤마 생성 + 숫자만 입력
/*    $("input:text[addComma]").on("keyup", function() {
        $(this).val($(this).val().replace(/\,/g, '')
            .replace(/[^0-9]/g, "")
            .replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,'));
    });*/

    //전화번호 자동 하이픈 추가 + 숫자만 입력
    $("input:text[addHyphen]").on("keyup", function() {
        $(this).val($(this).val().replace(/\,/g, '')
            .replace(/[^0-9]/g, "")
            .replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/,"$1-$2-$3")
            .replace("--", "-"));
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
