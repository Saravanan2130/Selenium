package week3.Inheritence;

public class Desktop extends Computer {

	public void desktopSize() 
	
	{
		System.out.println("Desktop screen size is 17 inches");
	
	}
	

	public static void main(String args[])
	
	{
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
