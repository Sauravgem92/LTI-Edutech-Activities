Enter Username
Mary
Do you want to continue ?(yes/no)
yes
Enter Username

Do you want to continue ?(yes/no)
yes
Enter Username
Roshan
Do you want to continue ?(yes/no)
yes
Enter Username

Do you want to continue ?(yes/no)
yes
Enter Username
Mary
Do you want to continue ?(yes/no)
no
Number of Users = 3
  
  
  Code:-
    
    import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> nameSet=new HashSet<>();

		while(true){
			System.out.println("Enter Username");
			String name=br.readLine();
            nameSet.add(name);

			System.out.println("Do you want to continue ?(yes/no)");
					String toContinue = br.readLine();
					if (toContinue.equals("no"))
						break;
		}

		System.out.println("Number of Users = " + nameSet.size());
	}

}

