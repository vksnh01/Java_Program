import java.util.*;

public class percentage{
	
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter The Amount: ");
double am = sc.nextDouble();
System.out.print("Enter The Interest Rate: ");
float intrst = sc.nextFloat();
System.out.print("Enter The Time Period: ");
int time = sc.nextInt();
double ttl = ((am*intrst*time)/100);
System.out.println("The Total Interest Is: "+ttl);
System.out.println("The Total Amount With Interest Is: "+(ttl+am));
}
}