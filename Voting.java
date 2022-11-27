import java.util.*;
public class Voting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int num = scan.nextInt();
       
        if(18<=num){
            System.out.print("Congratulations...\nYou Are Eligible For Voting");
        }else{
            int temp = 18-num;
            System.out.print("Sorry...\nYou Are Not Eligible For Voting \nYou are eligible after "+temp+" Year");

        }
    scan.close();
}}
