var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

//Fill your code

var num=Number(value)

if(num%2==0){
    console.log("Even number")
}else{
    console.log("Odd number")
}
