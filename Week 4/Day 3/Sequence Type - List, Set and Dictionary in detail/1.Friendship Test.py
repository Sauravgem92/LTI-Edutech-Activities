Sample Input 1:
2
3 2

Sample Output 1:
2

Sample Input 2:
5
4 1 3 7 5

Sample Output 2:
5

Sample Input 3:
6
1 2 3 3 2 1
Sample Output 3:
3



Code:-
  

if __name__=="__main__":
    #Fill your code here.
    n=int(input())
    days=input()

    input_list=days.split(" ")
    unique_list=[]

    for item in input_list:
        if item not in unique_list:
            unique_list.append(item)

    print(len(unique_list))
             
