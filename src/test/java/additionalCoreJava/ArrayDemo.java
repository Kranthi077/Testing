package additionalCoreJava;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] a = new int[4];
		a[0] = 5;
		a[1] = 3;
		a[2] = 9;
		a[3] = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();

		int b[] = new int[4];
		b[0] = 2;
		b[1] = 5;
		b[2] = 7;
		b[3] = 1;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		
		int[] c = { 2, 3, 8, 10 };
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
