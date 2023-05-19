package week3.Inheritence;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Student name is Saravanan");
	}
	
	public void studentDept()
	{
		System.out.println("Student Department is CSE");
	}
	
	public void studentId()
	{
		System.out.println("Student ID is 37");
	}
	

public static void main(String agrs[])
{
	Student s = new Student();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentName();
	s.studentId();
	s.studentDept();
}
}
