Enter the numbers
3 4 5 6 12 32 45 2 73
Even numbers from the list:
[4, 6, 12, 32, 2]
Odd numbers from the list:
[3, 5, 45, 73]



Code :-
  

if __name__=="__main__":
    #Fill your code here.
    t=input("Enter the numbers")

    list_of_strings=t.split(" ")
    num_list=list(map(int, list_of_strings))
    even_list=[]
    odd_list=[]

    for i in num_list:
        if int(i)%2==0 :
            even_list.append(i)
        else :
            odd_list.append(i)
    
    print("Even numbers from the list:")
    print(even_list,sep=", ")
    print("Odd numbers from the list:")
    print(odd_list,sep=", ")
