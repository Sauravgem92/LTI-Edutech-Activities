Sample Input 1:
10
4
8
15
Sample Output 1:
8

 
Sample Input 2:
10
4
8
12
Sample Output 2:
12



Code :-
  

if __name__=="__main__":
    #Fill your code here.
    n=int(input())
    n1=int(input())
    n2=int(input())
    n3=int(input())

    a=abs(n-n1)
    b=abs(n-n2)
    c=abs(n-n3)

    if (a<b and a<c):
        print(n1)
    elif (b<a and b<c):
        print(n2)
    elif (c<b and c<a):
        print(n3)
    elif (a==b and a<c):
        t=n1 if n1>n2 else n2
        print(t)
    elif(a==c and a<b):
        t=n1 if n1>n3 else n3
        print(t)
    elif(b==c and b<a):
        t=n2 if n2>n3 else n3
        print(t)
