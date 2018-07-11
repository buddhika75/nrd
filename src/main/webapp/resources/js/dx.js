var txt1 =  '<div class="row">';
var txt2 =    '<div class="col-10 clinicalCriteriaColRight">';
var txt4 = '</div>';
var txt5 = '</div>';
var txt3;
var txt;

$(document).ready(function () {
    $(".clinicalCriteriaDescription").click(function(e){
        txt = $(e.target).text();
        // alert($(e.target).text());
        //$('#myDx h5').val($(this).text())
        id = $(e.target).attr('id');
        if("otherCtd" == id){
            mytxt = '<div class="row"> <p class="clinicalCriteria selectedLinks col-3" onclick="deleteMe(this);" id="otherCtd">' + txt + '</p><input  type="text" id="inputOtherCtd" class="form-control col-8 "></div>';
        }else if("otherSpa" == id){
            mytxt = '<div class="row"> <p class="clinicalCriteria selectedLinks col-3" onclick="deleteMe(this);" id="otherSpa">' + txt + '</p><input  type="text" id="inputOtherSpa" class="form-control col-8"></div>';
        }
        else if("otherVasculitis" == id){
            mytxt = '<div class="row"> <p class="clinicalCriteria selectedLinks col-3" onclick="deleteMe(this);" id="otherVasculitis">' + txt + '</p><input  type="text" id="inputOtherVasculitis" class="form-control col-8"></div>';
        }
        else if("otherStd" == id){
            mytxt = '<div class="row"> <p class="clinicalCriteria selectedLinks col-3" onclick="deleteMe(this);" id="otherStd">' + txt + '</p><input  type="text" id="inputOtherStd" class="form-control col-8"></div>';
        }
        else if("otherRps" == id){
            mytxt = '<div class="row"> <p class="clinicalCriteria selectedLinks col-3" onclick="deleteMe(this);" id="otherRps">' + txt + '</p><input  type="text" id="inputOtherRps" class="form-control col-8"></div>';
        }
        else if("otherOther" == id){
            mytxt = '<div class="row"> <p class="clinicalCriteria selectedLinks col-3" onclick="deleteMe(this);" id="otherOther">' + txt + '</p><input  type="text" id="inputOtherOther" class="form-control col-8"></div>';
        }
        else {
            mytxt = '<p class="clinicalCriteria selectedLinks" onclick="deleteMe(this);">' + txt + '</p>';
        }

        $('#myDx').append(mytxt);
    });
})


function deleteMe(element) {
    var id = $(element).attr('id');
    if(( 'otherCtd' == id) || ('otherSpa' == id) || ('otherVasculitis' == id) || ('otherSts' == id) || ('otherRps' == id) || ('otherOther' == id)){
        $(element).parent().remove();

    }
    else {
        element.remove();
    }
}

