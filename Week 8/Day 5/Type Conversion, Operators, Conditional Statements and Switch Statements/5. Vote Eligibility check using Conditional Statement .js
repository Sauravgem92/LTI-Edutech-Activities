var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

//Fill your code
var age=Number(value)
    if(age>=18){
        console.log("Eligible")
    }else{
        console.log("Not Eligible");
    }
