//app.js
var fs = require('fs');

//To get the data from the file
var name = fs.readFileSync('input.txt').toString();

console.log(Number(name))

