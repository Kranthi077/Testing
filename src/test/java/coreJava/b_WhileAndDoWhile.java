package coreJava;

public class b_WhileAndDoWhile {

	public static void main(String[] args) {
		// While Loop

		
		  int i = 0;
		  
		  while (i < 5) { 
			  System.out.println("While loop is executed"); 
			  i++; // similarto i= i+1 which means i is incremented by 1 }
		  }
		  
		  int j=4; while (j >= 0) { 
			  System.out.println(j);
			  j--; // j=j-1 }
		  }
		 

		// Do While loop - It will run the loop one time though the condition fails

		  int k=0;
		do {
			 System.out.println("While loop is executed"); 
			  k++;
		} while (k < 5);

	}

}
