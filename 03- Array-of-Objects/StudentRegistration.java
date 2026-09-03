//Creating array of object for student for registration number of each student must be generated automatically.
class Student{
    private int Regno;
    private String name;
    private static int nextRegno = 1001;

    Student(String name){
        this.Regno = generateRegno();
        this.name = name;
    }

    private static int generateRegno(){
        return nextRegno++;
    }

    void showStudent(){
        System.out.println(Regno + " " + name);
    }
}

public class StudentRegistration{
    public static void main(String args[]){
        Student s[] = new Student[5];
        s[0] = new Student("Dev");
        s[1] = new Student("Kishan");
        s[2] = new Student("Devkishan");
        s[3] = new Student("Rahul");
        s[4] = new Student("Aditya");

        for(int i = 0;i<s.length;i++){
            s[i].showStudent();
        }
    }
}
