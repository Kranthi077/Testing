package additionalCoreJava;

public class MinNumberFromMultiDimenArray {

	public static void main(String[] args) {

		int[][] f = { { 8, 6, 10 }, { 8, 2, 5 }, { 1, -9, 0 } };

		int min = f[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int a = f[i][j];
				if (a < min) {
					min = a;
				}
			}
		}
		System.out.println("The minimum number present the matrix is: " + min);
	}
}
