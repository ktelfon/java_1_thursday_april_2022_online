package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

	public int getArrayLengthFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arrLength = sc.nextInt();
		return arrLength;
	}

	public int[] createArray(int arrayLength) {
		return new int[arrayLength];
	}

	public void fillArrayWithNumbersFromUser(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array element: ");
			arr[i] = sc.nextInt();
		}
	}

	public void fillArrayWithRandomNumbers(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000);
		}
	}

	public void printArrayToConsole(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr element = " + arr[i]);
		}
	}


}
