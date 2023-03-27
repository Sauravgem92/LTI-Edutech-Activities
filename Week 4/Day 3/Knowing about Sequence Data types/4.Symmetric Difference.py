The symmetric difference of two sets A and B is the set of elements that are in either of the sets A or B but not in both.

Note: print the elements in sorted order.
  
Sample Input 1:

1,2,3,4,5,6

2,3,5,7,8,9

Sample Output 1:

{1,4,6,7,8,9}

Sample Input 2:

1,2,3

1,2,3

Sample Output2:

invalid set



Code :-
  

if __name__=="__main__":
    #Fill your code here.
    input1=input()
    input2=input()

    first_set=set(map(int,input1.split(",")))
    second_set=set(map(int,input2.split(",")))

    if first_set==second_set:
        print("invalid set")
    else:
         print("{" + ",".join(str(num) for num in sorted(first_set.symmetric_difference(second_set))) + "}")
