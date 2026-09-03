//Finding distance between two point using class and object.
import java.util.Scanner;
class Point{
	double xco,yco;
	void Point(){
		xco = 0.0;
		yco = 0.0;
	}
	void Point(double xco, double yco){
		this.xco = xco;
		this.yco = yco;
	}
	double getDis(Point p){
		double dx = this.xco - p.xco;
		double dy = this.yco - p.yco;
		return Math.sqrt((dx*dx) + (dy*dy));
	}
}
public class PointMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.print("Enter first coordinates:");
		p1.xco = sc.nextDouble();
		p1.yco = sc.nextDouble();
		
		System.out.print("Enter second coordinates:");
		p2.xco = sc.nextDouble();
		p2.yco = sc.nextDouble();
		
		System.out.println("Distance = "+p1.getDis(p2));
	}
}
		