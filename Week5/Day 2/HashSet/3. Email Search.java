Sample Input and Output 1:

Enter Email address
Merry@gmail.com
Do you want to Continue?(yes/no)
yes
Enter Email address
Peter@yahoo.com
Do you want to Continue?(yes/no)
yes
Enter Email address
Christian@hotmail.com
Do you want to Continue?(yes/no)
yes
Enter Email address
Merry@gmail.com
Do you want to Continue?(yes/no)
no
Enter the email addresses to be searched separated by comma
Merry@gmail.com,Peter@yahoo.com
Email addresses are present


Sample Input and Output 2:

Enter Email address
Amelia@yahoo.com
Do you want to Continue?(yes/no)
yes
Enter Email address
Elizabeth@google.co.in
Do you want to Continue?(yes/no)
no
Enter the email addresses to be searched separated by comma
Elizabeth@google.co.in,jeryy@gmail.com
Email addresses are not present



Code :-
  
  
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> emailSet=new HashSet<>();

		while(true){
			System.out.println("Enter Email address");
			String email=br.readLine();
            emailSet.add(email);

			System.out.println("Do you want to continue ?(yes/no)");
					String toContinue = br.readLine();
					if (toContinue.equals("no"))
						break;
		}

		System.out.println("Enter the email addresses to be searched separated by comma");
		String emailsToSearch[]=br.readLine().split(",");

		int count=0;
		for(int i=0;i<emailsToSearch.length;i++){
			if(emailSet.contains(emailsToSearch[i])) count++;
		}

		if(count==emailsToSearch.length){
			System.out.println("Email addresses are present");
		}else{
			System.out.println("Email addresses are not present");
		}
	}

}


