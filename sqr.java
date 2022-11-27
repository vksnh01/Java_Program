import java.util.*;
public class sqr {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        float num = sc.nextFloat();
        System.out.print("The Square of "+num+" is = "+(num*num));
        sc.close();
    }
}
