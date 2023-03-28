Sample Input 1 :
Enter the no donors available
3
Enter the details of donor 1
Teller
teller@gmail.com
9832838773
O+ive
Enter the details of donor 2
Anderson
anderson@gmail.com
7332838773
O+ive
Enter the details of donor 3
Clark
clark@gmail.com
6372838773
O-ive
Enter the required blood group
O+ive

Sample Output 1 :
Details of matched donor
Teller
teller@gmail.com
9832838773
O+ive
Details of matched donor
Anderson
anderson@gmail.com
7332838773
O+ive
 
Sample Input 2 :
Enter the no donors available
1
Enter the details of donor 1
Anderson
anderson@gmail.com
7332838773
O+ive
Enter the required blood group
B+ive
Sample Output 2:

No donor with required blood group



Code :-
  

if __name__=="__main__":
    #Fill your code here.
    n=int(input("Enter the no donors available\n"))

    user_dict={}

    for i in range (n):
        print("Enter the details of donor", i+1)
        name=input()
        email=input()
        mobile=input()
        bloodGrp=input()
        user_dict[name]=[name,email,mobile,bloodGrp]
    
    print("Enter the required blood group")
    required_bloodgrp=input()


    found=0
    for key,value in user_dict.items():
        if required_bloodgrp==value[3] :
            print("Details of matched donor")
            for item in value:
                print(item)
            found+=1

    if(found==0):
        print("No donor with required blood group")
