Sample Input 1:
1
Sample Output 1:
1

Sample Input 2:
1000
Sample Output 2:
4



Code :-
  

if __name__=="__main__":
    #Fill your code here.
     x=int(input())

     count=0
     if x==0:
          count=1
          
     while x>0:
        t=x%10
        x=x//10
        count+=1 
    
     print(count)
