Swap using bitwise operators
Output consists of two integer swapped values.
Sample Input:

5
4

Sample Output:

Before Swapping the numbers : 5 4
After Swapping the numbers : 4 5




Code :-

if __name__=="__main__":
    #Fill your code here.
    x=int(input())
    y=int(input())

    print("Before Swapping the numbers :",x,y)

    x=x^y
    y=x^y
    x=x^y
    
    print("After Swapping the numbers :",x,y)
