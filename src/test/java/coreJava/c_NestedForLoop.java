package coreJava;

import java.util.Iterator;

public class c_NestedForLoop {

	public static void main(String[] args) {
		// Nested for loop working

		int m = 1;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4 - i; j++) {

				System.out.print(m);
				System.out.print(" ");
				m++;
			}
			System.out.println("");
		}
		
		System.out.println("");
		int k = 1;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < i + 1; j++) {

				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + 1);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}
}

//1234
//123
//12
//1

// 1 2 3 4
// 5 6 7
// 8 9
// 10

//1
//23
//456
//78910

//1
//12
//123
//1234




