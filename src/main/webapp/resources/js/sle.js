// var myVal = $(' .colRightComplications:checkbox:checked').value
// console.log(myVal);

// $('.countCheckboxes:checkbox:checked').each(function () {
//     var sThisVal = $(this).length;
//     console.log(sThisVal);
//
// });

function countCheckboxesFunc() {
    var vall =  $('.countCheckboxes:checkbox:checked').length;
    console.log(vall);
    $('.finalCount').text(vall);
}

