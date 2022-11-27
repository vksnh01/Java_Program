import java.util.*;
public class simple_Interest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter The Balance: ");
double bal = sc.nextDouble();
System.out.print("Enter The Intrest: ");
float intrest = sc.nextFloat();
System.out.print("Enter The Time Periods(In Months): ");
float time = sc.nextFloat();
double temp = (bal*intrest*time)/100;
System.out.println("Total Interest Is: "+temp);
System.out.println("Total Amount With Interest Is: "+(temp+bal));
sc.close();
    }
}
