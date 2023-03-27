Use Nested Dictionary store students details like d = { "pass" : {Roll No: mark } , "fail" : {Roll No: mark }} .

Sample Input and Output 1:
5
78
39
45
35
89
Students who failed in Final Exam
Roll No: 2 - Mark: 39
Roll No: 4 - Mark: 35
Students who passed in Final Exam
Roll No: 1 - Mark: 78
Roll No: 3 - Mark: 45
Roll No: 5 - Mark: 89

Sample Input and Output 2:
6
41
67
45
80
89
67
All are passed

Sample Input and Output 3:
6
39
37
35
30
29
17
All are failed



Code :-
  
if __name__=="__main__":
    #Fill your code here.
    n=int(input())

    dic={"fail":{},"pass":{}}

    for i in range(1,n+1):
        marks=int(input())
        if(marks<40):
            dic["fail"][i]=marks
        else:
            dic["pass"][i]=marks
    
    if(len(dic['pass'])==n):
         print("All are passed")
    elif(len(dic['fail'])==n):
        print("All are failed")
    else:
        flag=0
        print("Students who failed in Final Exam")
        for key, value in dic.items():
            for key1 in value:
                print("Roll No:",key1,"-","Mark:",value[key1])
            if(flag==0):
                print("Students who passed in Final Exam")
                flag=1
