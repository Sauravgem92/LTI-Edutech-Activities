Sample Input 1:
1 2 1
Sample Output 1:
4

Sample Input 2:
3 7 2
Sample Output 2:
20



Code:-
  

if __name__=="__main__":
    #Fill your code here.
    t=input()

    arr=t.split(" ")

    A=int(arr[0])
    B=int(arr[1])
    N=int(arr[2])

    for i in range(1,N+1):
        if(i%2==0):
            B*=2
        else:
            A*=2
    
    print(A+B)
