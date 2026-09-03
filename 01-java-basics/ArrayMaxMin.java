//Array initialisation and finding maximum and minimum numbers of arrray.
import java.util.Scanner;
public class ArrayMaxMin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter element of array :");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			else if(arr[i]<min){
				min = arr[i];
			}
		}
		
		System.out.println("Maximum = "+max);
		System.out.println("Minimum = "+min);
		return;
	}
}