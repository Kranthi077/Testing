package additionalCoreJava;

public class sample {

	public static void main(String[] args) {

		int[][] f = { { 8, 0, 10 }, { 8, 20, 15 }, { 6, 4, 1 } };

		int min = f[0][0];
		int minCol = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int a = f[i][j];
				if (a < min) {
					min = a;
					minCol = j;
				}
			}
		}
		System.out.println("The minimum number present the matrix is: " + min);
		System.out.println("Min Column " + minCol);

		int max = f[0][minCol];
		for (int i = 0; i < 3; i++) {

			int a = f[i][minCol];
			if (a > max) {
				max = a;
			}
		}
		System.out.println("Max value " + max);
	}
}
