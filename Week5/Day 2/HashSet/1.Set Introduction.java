Enter the username
John
Do you want to continue? (Y/N)
Y
Enter the username
Christoper
Do you want to continue? (Y/N)
Y
Enter the username
Ahamed
Do you want to continue? (Y/N)
Y
Enter the username
Ahamed
Do you want to continue? (Y/N)
N
The unique number of usernames is 3



Code:-

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> nameSet=new HashSet<>();

		while(true){
			System.out.println("Enter the username");
			String name=br.readLine();
            nameSet.add(name);

			System.out.println("Do you want to continue? (Y/N)");
					String toContinue = br.readLine();
					if (toContinue.equals("N"))
						break;
		}

		System.out.println("The unique number of usernames is " + nameSet.size());
	}

}

