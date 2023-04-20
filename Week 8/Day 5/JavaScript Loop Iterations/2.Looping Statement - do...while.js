var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

//Fill your code
var n=Number(value)
var sum=1

do{
    sum+=n
    console.log(sum)
}while(sum<=56)
