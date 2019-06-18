package main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)\n");
		Random random = new Random();
		int[] array = new int[10];
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

		System.out.println("3)-4)\n");// how many times will we meet following numbers:1,2,3,4,5
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				count1++;
			} else if (array[i] == 2) {
				count2++;
			} else if (array[i] == 3) {
				count3++;
			} else if (array[i] == 4) {
				count4++;
			} else if (array[i] == 5) {
				count5++;
			}

			System.out.print(array[i] + " ");
		}
		System.out.println("\n number 1 met " + count1 + " times");
		System.out.println(" number 2 met " + count2 + " times");
		System.out.println(" number 3 met " + count3 + " times");
		System.out.println(" number 4 met " + count4 + " times");
		System.out.println(" number 5 met " + count5 + " times");

		System.out.println("5)\n");

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

		System.out.println("\n6)\n");

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

		System.out.println("\n7)\n");
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
