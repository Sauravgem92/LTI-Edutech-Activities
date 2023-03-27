0 4 0 6 0 7 0 8
Initial Value: (0, 4, 0, 6, 0, 7, 0, 8)
Final value: (4, 6, 7, 8, 0, 0, 0, 0)
  
  
  
  Code :-
    

if __name__=="__main__":
    #Fill your code here.
    values=input()

    input_list=values.split(" ")
    initial_tuple= tuple(map(int, input_list))
    print("Initial Value:",initial_tuple)

    final_tuple=()
    count=0

    for i in initial_tuple:
        if i==0:
            count+=1
        else:
            t=(i,)
            final_tuple+=t
    
    for i in range(1,count+1):
         t=(0,)
         final_tuple+=t

    print("Final value:",final_tuple)
