package week1.assignment1;

public class IsPrime {

	public static void main(String[] args) {
	
		int n= 4;
		boolean isPrime=true;

			for (int i = 2; i <n; i++) 
			{
				if(n%i==0) 
				{
				isPrime=false;
			    }
			}
			
			if(isPrime)
				
			System.out.println("The entered number  "+n+"  is a prime number");
			
			else
				
			System.out.println("The entered number  "+n+"  is not a prime number");
	}

}
