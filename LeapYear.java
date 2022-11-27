import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int num = scan.nextInt();
        if((num%4==0) || (num%400==0) || (num%100==1)){
            System.out.print(num+" Is A Leap Year");

        }else{
            System.out.print(num+" Is Not A Leap Year");
        }
    scan.close();
    }
}
