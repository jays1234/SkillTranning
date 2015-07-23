var changeText = document.getElementById("changeText");
var arrayP = document.getElementsByTagName("p");
var click = document.getElementById("click");
console.log(1);
changeText.onclick=function (){
    console.log(arrayP.length);
    for(var i=0;i<arrayP.length;i++){
        if(arrayP[i].innerHTML==="aaa"){
            arrayP[i].innerHTML="bbb";
        }else if (arrayP[i].innerHTML==="bbb"){
            arrayP[i].innerHTML="aaa";
        }
    }
}
var array = [1,2,3];
//array[i]
// array.pop()=เอาตัวสุดท้ายออก
var object = {jays : "phirayu"};
//object.jays
//object['jays']
function a(){
    return "function a";
}
console.log(a());
var jsonString = '[{"jays":"phirayu"},{"jays":"jays"}]';
var json = JSON.parse(jsonString);
console.log(json[0].jays);



