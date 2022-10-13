package package1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ExceptionHandling2 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int a = 8, b = 0, c, d;

		int[] arr = new int[4];

		// c = a / b;
		try {
			int i = arr[5];
		} finally {

			System.out.println("Am in finally block");
		}

		System.out.println("first print satatement");

		d = b / a;

		System.out.println("End of code");
	}

}
