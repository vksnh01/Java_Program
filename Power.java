import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        float num = sc.nextFloat();
        System.out.print("Enter The Power: ");
        int p = sc.nextInt();
        float val = num;
       
        for(int i=1;i<p;i++){
            val *=num;
        }
        System.out.print("Result: "+num+" ^ "+p+" = "+(val));
        sc.close();
    }
}
