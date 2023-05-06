package week1.assignment2;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */

		String word = "sentences";
		char[] arr = word.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) 
			
		{
			boolean repeated = false;
			for (int j =i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					repeated = true;
					break;
				}
			}
				if(!repeated)
				{
					sb.append(arr[i]);
				}
				
			}
				
			System.out.println(sb);
		}
	
}


