
function calAsdas() {
   var spPain =  $('#spinalPain').val();
   var prphArth =  $('#prhpArthritis').val();
   var mrningStff = $('#mngStfns').val();
   var ptGlobAss = $('#ptGlobAssmnt').val();
   var crp = $('#crp').val();


    $('input[name=unit]:checked').val();

   var crpUnit = $('input[name=unit]:checked').val();
   if('mgl' == crpUnit){
       var crp = ($('#crp').val())/10;
       var asdasCrpCal = (0.121*spPain) + (0.058 * mrningStff) + (0.11 * ptGlobAss) + (0.073 * prphArth) + (0.579 * (Math.log(crp + 1)));
   }else {
       var asdasCrpCal = (0.121*spPain) + (0.058 * mrningStff) + (0.11 * ptGlobAss) + (0.073 * prphArth) + (0.579 * (Math.log(crp + 1)));
   }
   console.log(crp);
   console.log(asdasCrpCal)
  $('body .container-fluid .row #asdasCrp').text(Math.round(asdasCrpCal*100)/100);
}
 function calAsdasEsr() {
     var spPain =  $('#spinalPain').val();
     var prphArth =  $('#prhpArthritis').val();
     var mrningStff = $('#mngStfns').val();
     var ptGlobAss = $('#ptGlobAssmnt').val();
     var esr = $('#esr').val();

     var asdasEsrCal = (0.079*spPain) + (0.069 * mrningStff) + (0.113 * ptGlobAss) + (0.086 * prphArth) + (0.293 * (Math.sqrt(esr)));

     $('body .container-fluid .row #asdasEsr').text(Math.round(asdasEsrCal*100)/100);
 }
