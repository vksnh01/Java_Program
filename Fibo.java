import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=1,num3;
        System.out.print("Enter A Number For Print Fibonacci Series: ");
        int val = sc.nextInt();
        System.out.print(num1+" "+num2+" ");
        for(int i = 0; i<val;i++){
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 +" ");
        }
        sc.close();
    }
}
