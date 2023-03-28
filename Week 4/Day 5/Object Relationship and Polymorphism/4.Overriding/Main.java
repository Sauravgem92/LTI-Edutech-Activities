import java.io.IOException;
import java.util.Scanner;

 

public class Main {
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the name of the event:");
         String name=sc.nextLine();
         System.out.println("Enter the detail of the event:");
         String detail=sc.nextLine();
         System.out.println("Enter the owner name of the event:");
         String owner=sc.nextLine();      
         System.out.println("Enter the type of the event:\n1.Exhibition\n2.StageEvent");
         int n=sc.nextInt();
         switch (n)
         {
            case 1:
                System.out.println("Enter the number of stalls:");
                int stall=sc.nextInt();
                Event e=new Exhibition(name,detail,owner,stall);
                System.out.println("The projected revenue of the event is "+e.projectedRevenue());
                break;
            case 2:
                System.out.println("Enter the number of shows:");
                int show=sc.nextInt();
                System.out.println("Enter the number of seats per show:");
                int seat=sc.nextInt();
                Event s=new StageEvent(name,detail,owner,show,seat);
                System.out.println("The projected revenue of the event is "+s.projectedRevenue());
                break;
         }
    }
}
