count of even numbers and odd numbers from N
Sample Input and Output 1:
3
1 4 10
2 1

Sample Input and Output 2:
5
2 6 23 12 11
3 2



Code :- 
  

if __name__=="__main__":
    #Fill your code here.
    n=int(input())

    even_count=0
    odd_count=0

    t=(input())
    num_list=t.split(" ")

    for x in num_list :
        if int(x)%2==0:
            even_count+=1
        else :
            odd_count+=1
    
    print(even_count,odd_count)
