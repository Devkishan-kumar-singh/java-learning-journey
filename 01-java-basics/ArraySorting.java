//Searching for element in arrray.
import java.util.Scanner;
public class ArraySorting{
	public static void sorting(int[] arr){
		int n = arr.length;
		 for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
               
            }
        }
	}
			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter element of array :");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		sorting(arr);
		System.out.println("\nArray after sorting");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		return;
		
	}
}