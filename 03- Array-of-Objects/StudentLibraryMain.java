//Library managment for issue bookor return book for student.
class Student{
	private int rollno;
	private String name;
	private static int book = 3;
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	void issuebook(){
		if(book>0){
			book--;
			System.out.println("Book issued");
			System.out.println("Remainin book : "+book);
		}
		else{
			System.out.println("Book not available");
		}
	}
	void returnbook(){
		book++;
		System.out.println("Book returned");
		System.out.println("Remaining book : "+book);
	}
} // End of class
public class StudentLibraryMain{
	public static void main(String args[]){
		Student s[] = new Student[5];
		s[0] = new Student(101,"Dev");
		s[1] = new Student(102,"Kishan");
		s[2] = new Student(103,"Devkishan");
		s[3] = new Student(104,"Rahul");
		s[4] = new Student(105,"Aditya");
		
		s[0].issuebook();
		s[3].issuebook();
		s[4].issuebook();
		s[2].issuebook();
		s[4].returnbook();
		s[2].issuebook();
	}
}