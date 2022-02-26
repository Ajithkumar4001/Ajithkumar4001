package org.department;

import org.college.College;

public class Department extends College{
	public void deptName() {
		String r1="Engineering";
		System.out.println("DeptName    = "+r1);
	}
	public static void main(String[] args) {
		Department obj2=new Department();
		obj2.collegeCode();
		obj2.collegeRank();
		obj2.collegeName();
		obj2.deptName();
	}
}
