//Creating array of object for student
class Student{
	private int rollno;
	private String name;
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	public String toString(){
		return rollno + "  " +name;
	}
}
public class StudentMain{
	public static void main(String args[]){
		Student s[] = new Student[5];
		s[0] = new Student(101,"Dev");
		s[1] = new Student(102,"Kishan");
		s[2] = new Student(103,"Devkishan");
		s[3] = new Student(104,"Rahul");
		s[4] = new Student(105,"Aditya");
		for(int i = 0;i<s.length;i++)
		System.out.println(s[i]);
	}
}