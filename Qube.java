import java.util.*;
public class Qube {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        float num = sc.nextFloat();
        System.out.print("The Qube of "+num+" is = "+(num*num*num));
        sc.close();
    }
}
