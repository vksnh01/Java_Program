import java.util.*;

public class multi_Average{

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.print("Which You Want Average Total Number: ");
	int num = sc.nextInt();
	int[] arr;
	float temp =0;
	arr = new int[num];
	for( int i=0;i<num;i++){
		System.out.print("Enter "+(1+i)+" number: ");
		arr[i] = sc.nextInt();
		temp = temp + arr[i];
	}
	System.out.println("Total Average of: "+(temp/num));

}}