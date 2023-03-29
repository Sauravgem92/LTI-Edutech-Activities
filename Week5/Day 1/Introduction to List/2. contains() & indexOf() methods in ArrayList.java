import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of halls:");
		int n=sc.nextInt();
		sc.nextLine();

		ArrayList<String> halls=new ArrayList<>();

		for(int i=1;i<=n;i++){
			System.out.println("Enter the Hall Name " + i);
            halls.add(sc.nextLine());
		}

		System.out.println("Enter the hall name to be searched:");
		String search=sc.nextLine();

       if(halls.contains(search))
		System.out.println(search + " hall is found in the list at position " +halls.indexOf(search));
	   else
	   System.out.println(search + " hall is not found");
	     
	}
}
