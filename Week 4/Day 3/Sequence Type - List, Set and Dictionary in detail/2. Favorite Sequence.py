Lucy likes a sequence better if the sequence contains her favorite sequence in the movie as a substring.

Sample Input 1:
6
1 2 3 4 5 6
3
2 3 4

Sample Output 1:
Yes

Sample Input 2:
6
22 5 6 33 1 4
2
4 15

Sample Output 2:
No



Code :-
  

if __name__=="__main__":
    #Fill your code here.
    n=int(input())
    sequence=input()
    lenOfFavSequence=int(input())
    FavSequence=input()

    if FavSequence in sequence:
        print("Yes")
    else:
        print("No")
