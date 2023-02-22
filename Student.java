package org.student;

import org.department.Department;

public class Student extends Department{
public void StudentName(String name) {
	System.out.println("The student name is "+name);
}
public void StudentDepartment(String Dept) {
	System.out.println("The student department is "+Dept);
}
public void StudentId(int Id) {
	System.out.println("The student id is "+Id);
}
public static void main(String[] args) {
	Student info=new Student();
	info.collegeName("peri institute of technology");
	info.collegeCode(180181);
	info.deptName("Mechanical");
	info.StudentName("Divya");
	info.StudentDepartment("MECH");
	info.StudentId(14);
}
private void collegeRank(int i) {
	// TODO Auto-generated method stub
	
}
}
