var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
//fill your code

function findFibonacci(n){
      var a=0;
      var  b=1;
      var fib

      if(n==1){
          console.log(0)
      }else if(n==2){
            console.log(0)
            console.log(1)
      }else{
            console.log(0)
            console.log(1)
      for(var i=0;i<n-2;i++){
          fib=a+b;
          a=b;
          b=fib
          console.log(fib)
      }
   }
}

findFibonacci(input)
