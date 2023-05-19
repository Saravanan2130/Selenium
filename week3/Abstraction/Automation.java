package week3.Abstraction;

public class Automation extends MultipleLangauge implements Language,TestTool

{
	public void Selenium() 
	{

		System.out.println("Selenium is abstract method from interface TestTool ");
	}

	public void Java() 
	{
		System.out.println("Java is abstract method from interface Language ");
	}

	public void Ruby()
	{
		System.out.println("Ruby is a own method for Automation");
	}
	
	

		public static void main(String[] args) {
			
			Automation a = new Automation();
			a.Selenium();
			a.Java();
			a.Ruby();
			a.python();
			
			
		}
}
