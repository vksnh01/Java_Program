import java.util.*;
public class desending {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.print("Which You Want To Store Total Value In Array? ");
    int ttl = sc.nextInt();
    int arr[];
    arr = new int[ttl];
    int temp =0;
    for(int i = 0; i<ttl;i++){
        System.out.print("Enter "+i+" Value: ");
        arr[i] = sc.nextInt();
    }
    for(int j = 0; j<ttl;j++){
        for(int k = 0; k<ttl;k++){
            if(arr[k]<arr[j]){
                temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp; 
            }
        }
    }
    for(int z = 0;z<ttl;z++){
        System.out.print(arr[z]+" ");
    }
    sc.close();
    
    }
}
