import java.util.*;

public class multi_Addition{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Which You Want Add Total Number: ");
		int num = sc.nextInt();
		int[] arr;
		int temp = 0;
		arr = new int[num];
		for(int i = 0 ;i<num;i++){
			System.out.print("Enter "+(i+1)+" Number: ");
			arr[i] = sc.nextInt();
			temp = temp + arr[i];
		}
	System.out.println("The Sum Of Total "+num+" Is: "+temp);

	}
}