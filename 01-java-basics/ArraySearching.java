//Searching for element in arrray.
import java.util.Scanner;
public class ArraySearching{
	public static int search(int[] arr,int E){
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == E)
				return(i+1);
			
		}
		return -1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter element of array :");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter element to search in array");
		int E = sc.nextInt();
		int n = search(arr,E);
		if(n!=-1)
			System.out.println("Element found at "+n+" position");
		if(n==-1)
			System.out.println("Element not found");
		return;
	}
}
		
	