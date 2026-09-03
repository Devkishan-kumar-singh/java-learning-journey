//comparison between student.
import java.util.Scanner;

class Student {
    private String name;
    private int markMath;
    private int markEng;
    private char gradeLab;

    Student(String name, int markMath, int markEng, char gradeLab) {
        this.name = name;
        this.markMath = markMath;
        this.markEng = markEng;
        this.gradeLab = gradeLab;
    }

    boolean isStronger(Student s) {
        if (this.markMath != s.markMath) {
            return this.markMath > s.markMath;
        }
        if (this.markEng != s.markEng) {
            return this.markEng > s.markEng;
        }
        return this.gradeLab < s.gradeLab;
    }

    String getName() {
        return name;
    }

    int getMarkMath() {
        return markMath;
    }

    int getMarkEng() {
        return markEng;
    }

    char getGradeLab() {
        return gradeLab;
    }
}
public class StudentMain{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter details for Student 1:");
			System.out.print("Name: ");
			String name1 = sc.nextLine();
			System.out.print("Math Mark (0-100): ");
			int math1 = sc.nextInt();
			System.out.print("English Mark (0-100): ");
			int eng1 = sc.nextInt();
			System.out.print("Lab Grade (A-F): ");
			char lab1 = sc.next().charAt(0);
			sc.nextLine();

			Student s1 = new Student(name1, math1, eng1, lab1);

			System.out.println("\nEnter details for Student 2:");
			System.out.print("Name: ");
			String name2 = sc.nextLine();
			System.out.print("Math Mark (0-100): ");
			int math2 = sc.nextInt();
			System.out.print("English Mark (0-100): ");
			int eng2 = sc.nextInt();
			System.out.print("Lab Grade (A-F): ");
			char lab2 = sc.next().charAt(0);

			Student s2 = new Student(name2, math2, eng2, lab2);

			System.out.println("\n Comparison Result");
			if (s1.isStronger(s2)) {
				System.out.println(s1.getName() + " is stronger than " + s2.getName());
			} else {
				System.out.println(s1.getName() + " is NOT stronger than " + s2.getName());
			}
		}
}


	