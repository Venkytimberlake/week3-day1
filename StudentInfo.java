package org.student;

public class StudentInfo {
	int studentID;
	String studentName;
	Long studentMob;
	String studentCollege;
public void StudentInfo(int studentID, String studentName) {
	System.out.println(studentID+"****"+studentName);
}
public void StudentInfo(Long studentMob, String studentCollege) {
	System.out.println(studentMob+"****"+studentCollege);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo ram=new StudentInfo();
ram.StudentInfo(2, "venkatesh");
ram.StudentInfo(984545, "PU");


	}

}
