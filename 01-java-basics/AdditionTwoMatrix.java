//Input of a matrix and sum of diagonal element.
import java.util.Scanner;
public class AdditionTwoMatrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] matrixfirst = new int[3][3];
		int[][] matrixsecond = new int[3][3];
		int[][] matrixfinal = new int[3][3];
		System.out.println("Enter element of first matrix:");
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				matrixfirst[r][c] = sc.nextInt();
			}
		}
		System.out.println("\nEnter element of second matrix:");
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				matrixsecond[r][c] = sc.nextInt();
			}
		}
		System.out.println("Element of first matrix:");
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				System.out.print(matrixfirst[r][c]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Element of second matrix:");
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				System.out.print(matrixsecond[r][c]+" ");
			}
			System.out.print("\n");
		}
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
					matrixfinal[r][c] = matrixfirst[r][c] + matrixsecond[r][c];
			}
		}
		System.out.println("Element of matrix after addition:");
		for(int r= 0;r<3;r++){
			for(int c =0;c<3;c++){
				System.out.print(matrixfinal[r][c]+" ");
			}
			System.out.print("\n");
		}
		
	}
}
		