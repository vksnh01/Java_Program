import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int num = scan.nextInt();
    if(num%2==0){
        System.out.print(num+"is a even number");
    }else{
        System.out.print(num+"is a Odd number");
    }
scan.close();
    }
}
