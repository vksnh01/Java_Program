import java.util.*;
public class smallest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter First Number: ");
int val1 = sc.nextInt();
System.out.print("Enter First Number: ");
int val2 = sc.nextInt();
System.out.print("Enter First Number: ");
int val3 = sc.nextInt();
if(val1<val2 && val1<val3){
System.out.println(val1+" is a smallest number");
} else if(val2<val1 && val2<val3){
System.out.println(val2+" is a smallest number");
} else{
System.out.println(val3+" is a smallest number");
}}}