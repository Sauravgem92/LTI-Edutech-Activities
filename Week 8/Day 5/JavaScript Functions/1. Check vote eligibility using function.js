var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

//Fill your code
function checkAge(age){
    if(age>=18){
        console.log("Allowed")
    }else{
        console.log("Not Allowed");
    }
}

checkAge(value)
