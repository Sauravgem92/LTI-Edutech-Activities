var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var spl = input.trim();
var array = spl.split("\n");

//fill your code

function checkMax(array){
   if(array[0]>array[1]){
       return "John"
   }else {
       return "Joe"
   }
}

console.log(checkMax(array))
