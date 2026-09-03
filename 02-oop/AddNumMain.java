//2.	Performing method overloading by creating a class AddNumber
class AddNum{
	int addNum(int a ,int b){
		return a+b;
	}
	int addNum(int a ,int b,int c){
		return a+b+c;
	}
	double addNum(double a,double b){
		return a+b;
	}
}
public class AddNumMain{
	public static void main(String args[]){
		AddNum n1 = new AddNum();
		System.out.println("Sum of two integer num = "+n1.addNum(2,3));
		System.out.println("Sum of two integer num = "+n1.addNum(2,3,4));
		System.out.println("Sum of two integer num = "+n1.addNum(2.0,3.0));
	}
}