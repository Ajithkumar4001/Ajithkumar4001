package MultilevelInheritance;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		String Name = "Ajith";
		System.out.println("StudentName = "+Name);
	}
	public void studentDept() {
		String Dept="Computer Science and Engineering";
		System.out.println("StudentDept = "+Dept);
	}
	public void studentId() {
		int Id=001;
		System.out.println("StudentId   = "+Id);	
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentId();
		obj.studentName();
		obj.studentDept();
		
	}

}
