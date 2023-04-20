//app.js
var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

var num=Number(value)

var add=num+2
console.log("Addition : "+ add)
var sub=num-2
console.log("Subtraction : "+ sub)
var mul=num*2
console.log("Multiplication : " + mul)
var div=num/2
console.log("Division : " + div)
var modulo=num%2
console.log("Modulo : " + modulo)
//Fill your code
