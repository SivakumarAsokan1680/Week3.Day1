package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
	System.out.println("Sivakumar");
	}
	public void studentDepartment() {
		System.out.println("Mechnical Engineering");

	}
	public void studentID() {
		System.out.println(12345);
	}
	public static void main(String[] args) {
		
	Student MyStudent = new Student();
	MyStudent.collegeName();
	MyStudent.collegeCode();
	MyStudent.collegeRank();
	MyStudent.deptName();
	MyStudent.studentName();
	MyStudent.studentDepartment();
	MyStudent.studentID();
	}


}

