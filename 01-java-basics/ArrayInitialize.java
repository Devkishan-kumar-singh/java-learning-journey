//Array initialisation and printing the numbers of arrray.
import java.util.Scanner;
public class ArrayInitialize{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter element of array :");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		float avg = 0;
		for(int i = 0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		avg = (float)sum/arr.length;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
		return;
	}
}