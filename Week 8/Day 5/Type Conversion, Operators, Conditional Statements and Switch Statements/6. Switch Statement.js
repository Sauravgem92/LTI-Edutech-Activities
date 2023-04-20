var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

//Fill your code
var modulo=Number(value)%7

if(modulo==0){
    console.log("Sunday")
}else if(modulo==1){
    console.log("Monday")
}else if(modulo==2){
    console.log("Tuesday")
}else if(modulo==3){
    console.log("Wednesday")
}else if(modulo==4){
    console.log("Thursday")
}else if(modulo==5){
    console.log("Friday")
}else if(modulo==6){
    console.log("Saturday")
}else if(modulo==7){
    console.log("Sunday")
}
