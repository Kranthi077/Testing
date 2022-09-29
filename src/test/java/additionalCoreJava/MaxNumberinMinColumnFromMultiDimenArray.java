package additionalCoreJava;

import java.util.Iterator;

public class MaxNumberinMinColumnFromMultiDimenArray {

	// Find out the max number from the column where minimum number occurs in
	// multi-dimensional matrix

	public static void main(String[] args) {
		int[][] f = { { 8, 0, 10 }, { 8, 20, 15 }, { 6, 4, 1 } };
		int min = f[0][0];
		int minColumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int a = f[i][j];
				if (a < min) {
					min = a;
					minColumn = j;
				}
			}
		}
		System.out.println("The minimum number present the matrix is: " + min);
		System.out.println(minColumn);

		int max = f[0][minColumn];

		for (int i = 0; i < 3; i++) {
			int a = f[i][minColumn];
			if (a > max) {
				max = a;
			}

		}
		System.out.println("Max number present at Min column '" + minColumn + "' in the matrix is: " + max);
	}
}
