//Input of a matrix and sum of diagonal element.
import java.util.Scanner;
public class InputMatrixAndSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		System.out.println("Enter element of matrix:");
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				matrix[r][c] = sc.nextInt();
			}
		}
		System.out.println("Element of matrix:");
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				System.out.print(matrix[r][c]+" ");
			}
			System.out.print("\n");
		}
		int sum = 0;
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				if(r==c){
					sum = sum + matrix[r][c];
				}
			}
		}
		System.out.println("Sum of diagonal element is :"+sum);
	}
}
		