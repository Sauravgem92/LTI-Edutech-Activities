var fs = require('fs');
var input = fs.readFileSync("input.txt").toString();
//Fill your code

var lines=input.split("\n")
//  console.log(lines[0])
var arr=lines[0].split(",").map(x => Number(x))

console.log("Elements in the array : " + arr)
arr.pop()
console.log("Removing last element : "+ arr)
arr.push(Number(lines[1]))
console.log("Adding an element at the end : " + arr)
arr.shift()
console.log("Removing first element : " + arr)
