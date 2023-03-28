Sample input :
4
10
KA09MN01
51178964525
258795462
Chandan V
Mysore
KA09MN02
51178964525
258795462
Chandru V
Mysore
KA09MN03
51178964525
258795462
Chandini V
Mysore
KA09MN04
51178964525
258795462
Chandana A
Mysore
 

Sample output:
Reg.no: chassis no: engine no: owner name: address:
KA09MN01 51178964525 258795462 Chandan V Mysore
KA09MN02 51178964525 258795462 Chandru V Mysore
KA09MN03 51178964525 258795462 Chandini V Mysore
KA09MN04 51178964525 258795462 Chandana A Mysore



Code:-
  

if __name__=="__main__":
    #Fill your code here.
    noOfVehicle=int(input())
    maxLimit=int(input())

    details=[]

    for i in range(1,noOfVehicle+1):
        registrationNo=input()
        chassisNo=input()
        engineNo=input()
        name=input()
        city=input()
        details.append([registrationNo,chassisNo,engineNo,name,city])

    print("Reg.no: chassis no: engine no: owner name: address:")
    for nestedlist in details:
        print(*nestedlist)
