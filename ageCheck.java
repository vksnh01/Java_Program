import java.util.*;
public class ageCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Addition ad = new Addition();
        ad.addition();
        System.out.print("Enter Your Age : ");
        int num = scan.nextInt();
        if(num<=7){
            System.out.print(num+" is a Child group age");
        }else if(7<num && num<=18){
            System.out.print(num+" is a Boy group age");
        }else if(18<num && num<=25){
            System.out.print(num+" is a Young group age");
        }else if(25<num && num<=60){
            System.out.print(num+" is a Mature group age");
        }else if(60<num ){
            System.out.print(num+" is a Old group age");
        }
    scan.close();
        }
}
