package week1.assignment1;

public class Fibbinocci {

	public static void main(String[] args) {
		        int firstNum = 0;
				int secNum = 1;
				int sum;
				

	
				for(int i=0; i<5; i++) {
					sum = firstNum + secNum; 
					firstNum = secNum; 
					secNum = sum; 
			
				System.out.println(sum);
				

				}
			
	}

}
