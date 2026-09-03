//Array initialisation and printing the numbers of arrray.
import java.util.Scanner;
public class DuplicateRemoval{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter element of array :");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before duplicate removal:");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		for(int i = 0;i<arr.length;i++){
			arr[i] ^ arr[i];
		}
		
		
		System.out.println("\nArray after duplicate removal:");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	
		return;
	}
}