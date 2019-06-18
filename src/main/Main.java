package main;

import java.util.Random;

public class Main {
	private static int[] array = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)\n");
		sum();

		System.out.println("3)-4)\n");// how many times will we meet following numbers:1,2,3,4,5
		duplicatingElements();
		System.out.println("5)\n");
		symbols();
		System.out.println("\n6)\n");
		zeroAndOne();
		System.out.println("\n7)\n");
		evenAndOdd();

	}

	public static void sum() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + (int) (Math.random() * 5);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n2)\n");
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum " + sum);
	}

	public static void duplicatingElements() {
		int arrayIndex[] = new int[6];

		for (int i = 0; i < array.length; i++) {
			arrayIndex[array[i]]++;
		}
		System.out.println("\n number 1 met " + arrayIndex[1] + " times");
		System.out.println(" number 2 met " + arrayIndex[2] + " times");
		System.out.println(" number 3 met " + arrayIndex[3] + " times");
		System.out.println(" number 4 met " + arrayIndex[4] + " times");
		System.out.println(" number 5 met " + arrayIndex[5] + " times");

		System.out.println("\n");
	}

	public static void symbols() {

		int[] digits = new int[12];
		char[] symbols = new char[12];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = 1 + (int) (Math.random() * 5);
		}

		for (int i = 0; i < digits.length; i++) {
			System.out.print(" " + digits[i] + " ");
		}
		System.out.println("\n");

		for (int i = 0; i < digits.length; i++) {
			symbols[i] = Integer.toString(digits[i]).charAt(0);
			System.out.print(" " + (int) symbols[i] + " ");
		}
	}

	public static void zeroAndOne() {

		int array1[] = new int[15];

		for (int i = 0; i < array1.length; i++) {
			if ((int) (Math.random() * 5) - 2 > 1.2) {
				array1[i] = 1;
			} else {
				array1[i] = 0;
			}
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i] + " ");
		}

		System.out.println("\n");

		int length0 = 0;

		int maxLength0 = 0;

		int length1 = 0;

		int maxLength1 = 0;

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] == 0) {
				length0++;
				length1 = 0;
			}

			if (array1[i] == 1) {
				length0 = 0;
				length1++;
			}

			maxLength0 = Math.max(maxLength0, length0);
			maxLength1 = Math.max(maxLength1, length1);
		}

		System.out.println(" 0 met " + maxLength0 + " times in a row \n" + " 1 met " + maxLength1 + " times in a row");

	}

	public static void evenAndOdd() {
		Random random = new Random();

		int[] array2 = new int[10];
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for (int i = 0; i < array2.length; i++) {
			array2[i] = random.nextInt(10);
		}
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0) {
				sumOfEven += array2[i];
			}
			if (array2[i] % 2 != 0) {
				sumOfOdd += array2[i];
			}
			System.out.print(array2[i] + " ");
		}
		System.out.println("\n Sum of odd " + sumOfOdd);
		System.out.println("\n Sum of even " + sumOfEven);
	}
}
