package week1.assignment2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
		/*
		 Pseudo Code
		 * Declare String Input as Follow
		 * String test = "changeme";
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c)find the odd index within the loop (use mod operator)
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 * 
		 */
		
		String word = "changeme";
		char[] word2 = word.toCharArray();
				
		for(int i = 0; i<word2.length; i++)
		{
			if(i%2!=0)
			
			{
				System.out.print( Character.toUpperCase(word2[i]));
			} 
			
			else
			{
				System.out.print(word2[i]);
			}
		}

	}

}
