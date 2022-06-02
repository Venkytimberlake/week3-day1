package org.student;

import org.department.Department;

public class Students extends Department{
	public void studentName() {
		System.out.println("Venkatesh");
	}
public void studentDept() {
	System.out.println("IB");
}
public void studentID() {
	System.out.println("ID007");
}
	public static void main(String[] args) {
Students ram=new Students();
ram.collegeCode();
ram.collegeName();
ram.collegeRank();
ram.departmentName();
ram.studentDept();
ram.studentID();
ram.studentName();

	}

}
