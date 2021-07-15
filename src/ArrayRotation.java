package com.arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		//WAP to left rotate an array by d elements of given size
		int[] intergerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		rotate(intergerArray, 3, intergerArray.length);
		printArray(intergerArray);
	}

	//Utility function to print array
	public static void printArray(int[] array) {
		for (int item : array) {
			System.out.print(" " + item);
		}
	}

	//Function to left rotate an array by one position
	public static void leftRotateByOne(int array[], int size) {
		int temp = array[0];
	
		for (int i = 0; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		array[size - 1] = temp;
	}

	public static void rotate(int array[], int d, int size) {

		for (int i = 0; i < d; i++) {
			leftRotateByOne(array, size);
		}
	}
}
