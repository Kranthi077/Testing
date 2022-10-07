package additionalCoreJava;

public class FinalKeywordDemo extends Test {

	public static void main(String[] args) {

		int i = 0;

		i++;
		System.out.println(i);
		
		// once you initialize any final variable, you cannot change its value later
		final int j=6; // constant variables
	
		System.out.println(j);
		
		
		FinalKeywordDemo ob = new FinalKeywordDemo();
		ob.getData();
		

	}

}
