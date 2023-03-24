Sample Input 1:
447474
Sample Output 1:
4

Sample Input 2:
12
Sample Output 2:
0



Code :-
  

if __name__=="__main__":
    #Fill your code here.
    x=int(input())

    count=0

    while x>0:
        t=x%10
        x=x//10
        if t==4 :
            count+=1 
    
    print(count)
