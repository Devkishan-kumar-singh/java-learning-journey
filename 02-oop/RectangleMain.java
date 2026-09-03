//Finding area of Rectangle using class and object.
class Rectangle{
	double length;
	double width;
	void setDim(double length , double width){
		this.length = length;
		this.width = width;
	}
	double getArea(){
		return length*width;
	}
}
public class RectangleMain{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle();
		r1.setDim(3.4,4.5);
		System.out.println("Area = "+r1.getArea());
	}
}