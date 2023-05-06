package week1.assignment2;

public class RemoveDuplicates {

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
		
		String text = "We Learn Java Basics as part of Java session in Java Week 1";
		int count = 0;
		String[] arr=text.split(" ");
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i].equalsIgnoreCase(arr[j]))
				{
					arr[j]="";
					count++;
			}
		}
		}
		
			if(count>0)
			{
				for(int a=0;a<arr.length; a++)
				{
					System.out.print(arr[a]+" ");
					
				}
			}
		}
	}



