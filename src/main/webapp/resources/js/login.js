if(typeof jQuery!=='undefined'){
    console.log('jQuery Loaded');
}
else{
    console.log('not loaded yet');
}

$(document).ready(new function () {
    $(".login").click(function(){
      console.log("The Login Text was clicked.");
    });
});