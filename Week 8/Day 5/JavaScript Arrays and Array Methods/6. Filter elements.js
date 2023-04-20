let fs=require('fs');
let input= fs.readFileSync("input.txt").toString().trim().split(",");

var arr=[]
   for(var i=0;i<input.length;i++){
  arr[i]=Number(input[i])
}

const filterArray = (arr) => {
   //fill your code 

   var ans=arr.filter(function (num){
          return num>5
   })
   if(ans.length == 0){
         console.log("Elements in the array are less than 5")
   }else{
         for(var i=0;i<ans.length;i++)
                  console.log(ans[i])
   }
 
}
filterArray(arr)
   


