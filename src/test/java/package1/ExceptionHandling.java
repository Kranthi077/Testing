package package1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a = 8, b = 0, c, d;

		int[] arr = new int[4];

		/*
		 * try { // this line throws a error // c = a / b; int i = arr[5]; }
		 * 
		 * catch (ArrayIndexOutOfBoundsException e1) {
		 * System.out.println("ArrayIndexOutOfBoundsException"); e1.printStackTrace(); }
		 * catch (ArithmeticException e1) { System.out.println("ArithmeticException");
		 * e1.printStackTrace(); }
		 * 
		 * catch (Exception e) { System.out.println("Exception"); e.printStackTrace(); }
		 */
		try {
			// this line throws a error
			// c = a / b;
			int i = arr[5];
			//edit sheet
		} catch (Exception e) {

			e.printStackTrace();
		}

		finally {
			//close the sheet
			System.out.println("am inside finally");
		}

		System.out.println("first print satatement");

		d = b / a;

		System.out.println("End of code");
	}

}
