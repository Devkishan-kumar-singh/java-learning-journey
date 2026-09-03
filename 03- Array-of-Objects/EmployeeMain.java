//Creating array of object for Employee
class Employee{
	private int empid;
	private String name;
	Employee(int empid,String name){
		this.empid = empid;
		this.name = name;
	}
	void showEmp(){
		System.out.println(empid + "  " + name);
	}
}
public class EmployeeMain{
	public static void main(String args[]){
		Employee e[] = new Employee[5];
		e[0] = new Employee(101,"Dev");
		e[1] = new Employee(102,"Kishan");
		e[2] = new Employee(103,"Devkishan");
		e[3] = new Employee(104,"Rahul");
		e[4] = new Employee(105,"Aditya");
		System.out.println("Details of Employee :");
		for(int i = 0;i<e.length;i++)
			e[i].showEmp();
		
	}
}