import java.util.Scanner;
public class Subtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter First Number: ");
        double num2 = scan.nextDouble();
        System.out.print("The Subtraction of "+num1+" and "+num2+" is = "+(num1-num2));
        scan.close();
    }    
}
