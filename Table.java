import java.util.*;

public class Table{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Table Number: ");
int num = sc.nextInt();
for(int i=1;i<=10;i++){
System.out.print(num+"*"+i+"="+(num*i));
System.out.print("\t");
System.out.print((num+1)+"*"+i+"="+(num*i));
System.out.print("\t");
System.out.print((num+2)+"*"+i+"="+(num*i));
System.out.print("\t");
System.out.print((num+3)+"*"+i+"="+(num*i));
System.out.print("\t");
System.out.print((num+4)+"*"+i+"="+(num*i));
System.out.print("\t");
System.out.println((num+5)+"*"+i+"="+(num*i));
}
}}