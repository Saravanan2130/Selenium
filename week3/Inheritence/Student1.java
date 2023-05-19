package week3.Inheritence;

public class Student1 
{
	public void getStudentInfo(int a, long b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void getStudentInfo(String a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	

	
public static void main(String agrs[])
{
	Student1 s = new Student1();
	s.getStudentInfo(37, 9955887744l);
	s.getStudentInfo("saravanan","testmail@gmail.com");
}
}
