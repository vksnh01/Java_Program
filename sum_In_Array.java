import java.util.*;
public class sum_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which You Want Add Total Number? ");
        int ttl = sc.nextInt();
        float arr[];
        arr = new float[ttl];
        float temp =0;
        for(int i=0;i<ttl;i++){
            System.out.print("Enter "+i+" Value: ");
            arr[i] = sc.nextInt(); 
            temp += arr[i];
        }
        System.out.print("The Sum Of Total "+ttl+" Value Is: "+temp);
        sc.close();
    }
}
