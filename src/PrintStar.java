package com.july;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRightTriangleStar(10);
		printLeftTriangleStar(10);
	}

	public static void printRightTriangleStar(int size) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				// Print stars
				System.out.print("*");
			}
			// Print new line
			System.out.println();
		}
	}

	public static void printLeftTriangleStar(int size) {
		// First loop
		for (int i = 0; i < size; i++) {

			// Second loop
			for (int j = 0; j < size - 1 - i; j++) {
				// Print space
				System.out.print(" ");
			}

			// Third loop
			for (int k = 0; k <= i; k++) {
				// Print star
				System.out.print("*");
			}
			// Print new line
			System.out.println();
		}
	}
}
