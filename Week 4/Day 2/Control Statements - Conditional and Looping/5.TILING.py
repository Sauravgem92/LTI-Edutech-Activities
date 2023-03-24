****************************************************************************************************************************************************************
This program must calculate how many tiles are needed to tile a floor.
The tiles are 8 inches by 8 inches. Tiles can be used as a whole or a part of the tile can be used.
Only one usable piece can be cut from a tile. That is, if a piece is cut from a tile,
the rest of the tile must be thrown away. The program accepts the length and width of the room 
and returns how many whole tiles are used and how many part tiles are used.
The length is given in inches.

Sample Input 1
160
240
Sample Output 1:
600
0

Sample Input 2:
100
120
Sample Output 2:
180
15



Code:-
  

if __name__=="__main__":
    #Fill your code here.
    width = int(input())
    length = int(input())

    full_tiles_length=length//8
    full_tiles_width =width//8
    frac_length = (length/8)%1
    frac_width =(width/8)%1 
    cl=0
    cw=0
    if(frac_width!=0 ):
        cw =full_tiles_length
    if(frac_length!=0):
        cl =full_tiles_width
    print(full_tiles_length*full_tiles_width)
    if(cl!=0 and cw!=0):
        print(cl+cw+1)
    else:
        print(cl+cw)
