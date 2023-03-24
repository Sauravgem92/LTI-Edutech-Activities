Absolute difference between the first and last digit in the registration code

Sample Input 1:
345
Sample Output 1:
2

Sample Input 2:
9
Sample Output 2:
Invalid Input



Code :-
  

if __name__=="__main__":
    #Fill your code here.
    n=int(input())
    

    if(n<10):
        print("Invalid Input")
    else:
        first=0
        last=n%10
        n=n//10

        while(n>0):
            first=n%10
            n=n//10
    
        print(abs(first-last))
