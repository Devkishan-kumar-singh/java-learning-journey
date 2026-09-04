import java.util.ArrayList;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentList {
    public static void main(String args[]) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "dev", 80);
        Student s2 = new Student(2, "kishan", 56);
        Student s3 = new Student(3, "devkishan", 40);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("=======Details of students=======");
        
        for (int i = 0; i < students.size(); i++) {
            students.get(i).showDetails();
        }
    }
}

