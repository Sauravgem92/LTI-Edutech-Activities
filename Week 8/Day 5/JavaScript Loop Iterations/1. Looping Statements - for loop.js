var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

//Fill your code

var n=Number(value)

for(var i=1;i<=10;i++){
    console.log( i + " * "  + n  + " = " + i*n)
}
