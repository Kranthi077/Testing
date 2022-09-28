package additionalCoreJava;

public class MultiDimentionalArray {

	public static void main(String[] args) {

		// int[] a = new int[4];
		// a[0] = 5;

		int[][] d = new int[3][3];
		d[0][0] = 1;
		d[0][1] = 6;
		d[0][2] = 10;
		d[1][0] = 8;
		d[1][1] = 2;
		d[1][2] = 5;
		d[2][0] = 9;
		d[2][1] = 4;
		d[2][2] = 3;

		// System.out.println(d[2][2]);

		// System.out.println();

		int[][] f = { { 1, 6, 10 }, { 8, 2, 5 }, { 9, 4, 3 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int a = f[i][j];
				System.out.print(f[i][j]);
				System.out.print(" ");
			}
			System.out.println();

		}
	}

}
