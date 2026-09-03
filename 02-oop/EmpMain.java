//Employe Deatails
class Employee{
	private String name;
	private int empno;
	private double basicsal,da,hra,gross;
	Employee(String name, int empno, double basicsal) {
        this.name = name;
        this.empno = empno;
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
	