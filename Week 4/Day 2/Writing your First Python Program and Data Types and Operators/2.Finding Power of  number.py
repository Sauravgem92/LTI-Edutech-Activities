Output Format:
Output consists of power of N consecutive numbers.
Sample Input and Output 1:
Enter the value of a
2
Enter the value of b
5
Enter the value of n
7
2**5=32
3**5=243
4**5=1024
5**5=3125
6**5=7776
7**5=16807
8**5=32768

Sample Input and Output 2:
Enter the value of a
4
Enter the value of b
6
Enter the value of n
-1
Invalid Input


Code :- 

if __name__=="__main__":
    #Fill your code here.
    def Power(a,b,n):
         for i in range(a,a+n):
            print(f"{i}**{b}=",i**b)
    
    a=int(input("Enter the value of a"))
    b=int(input("Enter the value of b"))
    n=int(input("Enter the value of n\n"))

    if b<0 or n<0 :
        print("Invalid Input")
    else:
       Power(a,b,n)
