if(typeof jQuery!=='undefined'){
    console.log('jQuery Loaded');
}
else{
    console.log('not loaded yet');
}

addEventListener("load", function () {
    setTimeout(hideURLbar, 0);
}, false);

function hideURLbar() {
    window.scrollTo(0, 1);
}

$(document).ready(new function () {
    $(".login").click(function(){
      console.log("The Login Text was clicked.");
    });

//    $(".facebook").click(function(){
//      console.log("The Login Text was clicked.");
//      window.location.href = "/user";
//    });
});