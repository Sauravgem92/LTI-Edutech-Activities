Sample Input 1:
50
50
40
40
120
Sample Output 1:
B3


Sample Input 2:
50
50
40
40
180
Sample Output 2:
EXT



Code:-
  

if __name__=="__main__":
    #Fill your code here.
    B1=int(input())
    B2=int(input())
    B3=int(input())
    B4=int(input())
    N=int(input())

    if(B1>N):
        print("B1")
    elif(B1+B2 > N):
        print("B2")
    elif(B1+B2+B3 > N):
        print("B3")
    elif(B1+B2+B3 +B4 > N):
         print("B4")
    elif(B1+B2+B3 +B4 <= N):
        print("EXT")
    
