var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

//Fill your code
var age=Number(value)

    if(age>=15 && age<=60){
        console.log("Allowed")
    }else{
        console.log("Not Allowed");
    }
