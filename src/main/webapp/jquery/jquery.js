var clikeMe =$("button[name = 'clickMe']");
var clikeIt =$("button[name = 'clickIt']");
var ajaxButton = $("button[name = 'ajax']");
clikeMe.click(function(){
   console.log("click Me");
});
clikeIt.bind("click",function(){
    console.log($("input[name='input']").val());
});
var button = $('button');
button.each(function(index,item){
   console.log(button[index].className);
});

ajaxButton.bind("click",function(){
    var ajax=$.ajax({
        url: "/Training/ajaxTrain.html",
        type: "GET",

        async: false
    }).responseText;
    console.log(ajax);
    var ajaxJSON = JSON.parse(ajax);
    $("tbody").empty();
    $.each(ajaxJSON,function(index,item){
        $("tbody").append("<tr>" +
        "<td>"+item.studentId+"</td>" +
        "<td>"+item.firstName+"</td>" +
        "<td>"+item.lastName+"</td>" +
        "</tr>");
    });
});



