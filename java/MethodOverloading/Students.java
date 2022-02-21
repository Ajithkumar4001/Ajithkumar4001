package MethodOverloading;
///////////METHOD OVERLOADING///////////////////////////
public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id         :"+id);
	}
	public void getStudentInfo(String name) {
		System.out.println("Student Name       :"+name);
	}
	public void getStudentInfo(String email,long i) {
		System.out.println("Student Email-id   :"+email);
		System.out.println("Student PhoneNumber:"+i);
	}
	public static void main(String[] args) {
		Students r2=new Students();
		System.out.println("METHOD OVERLOADING");
		System.out.println("-----------------");
		r2.getStudentInfo(001);
		r2.getStudentInfo("AJITH");
		r2.getStudentInfo("ajithkumarengineering@gmail.com", 9786252546L);
		
	}


}
