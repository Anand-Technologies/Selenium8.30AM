package org.test.base;

import java.util.Scanner;

public class Emis1 {
	public static void main(String[] args) {
		System.out.println("Enter the input: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0; 
		int n = num;

		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println("count:" + count);

		if (count == 9) {
			System.out.println("Output: " + n);
			System.out.println("9 digit number generated");

		}

		else {

			String val = String.valueOf(n);
			System.out.println("number as string: " + val);
			int add = 9 - count;
			System.out.println("Add value :" + add);
			switch (add) {
			case 1:
				String s1 = val + "1";
				System.out.println("Output: " + s1);
				break;

			case 2:
				String s2 = val + "01";
				System.out.println("Output: " + s2);

				break;

			case 3:
				String s3 = val + "001";
				System.out.println("Output: " + s3);

				break;
			case 4:
				String s4 = val + "0001";
				System.out.println("Output: " + s4);

				break;
			case 5:
				String s5 = val + "00001";
				System.out.println("Output: " + s5);

				break;
			case 6:
				String s6 = val + "000001";
				System.out.println("Output: " + s6);

				break;
			case 7:
				String s7 = val + "0000001";
				System.out.println("Output: " + s7);

				break;
			case 8:
				String s8 = val + "00000001";
				System.out.println("Output: " + s8);

				break;
			case 9:
				String s9 = val + "000000001";
				System.out.println("Output: " + s9);

				break;

			default:
				break;
			}
		}
	}
}
