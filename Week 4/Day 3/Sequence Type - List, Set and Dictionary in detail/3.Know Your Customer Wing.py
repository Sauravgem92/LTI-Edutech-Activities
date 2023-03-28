Sample Output 1:

Door-no: 4475

Street: Main Street

Area: Virginia

City: Rescue

State: Virginia

Zipcode: 23424

Country: United States

Sample Input 2:

2358,Daffodil Lane,Illinois,Elgin,Illinois,60124,United States



Code:-
  

if __name__=="__main__":
    #Fill your code here.
    address=input()

    address_list=address.split(",")

    print("Door-no:",address_list[0],"\nStreet:",address_list[1],"\nArea:",address_list[2],"\nCity:",address_list[3],"\nState:", address_list[4],"\nZipcode:",address_list[5],"\nCountry:",address_list[6])


  
