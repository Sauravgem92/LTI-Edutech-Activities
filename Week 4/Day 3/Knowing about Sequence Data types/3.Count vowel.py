Enter the word :

Alice

Count of vowels in Alice is 3



Code:-
  

if __name__=="__main__":
    #Fill your code here.
    word=input("Enter the word :\n").lower()

    count=0

    for x in word:
        if(x == 'a' or x == 'e' or x == 'i' or x == 'o' or x == 'u'):
            count+=1;
    
    word=word.capitalize()
    print(f"Count of vowels in {word} is",count)
