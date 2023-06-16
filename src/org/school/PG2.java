package org.school;

public class PG2 {
	public static void main(String[] args) {

		int count = 0;
		for (int n = 1; n <= 1000; n++) {
			int i = 0, j = 0;
			int a = n;

			while (a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;
			}
			if (n == j) {

				count++;

			}
		}
			System.out.println(count);

		}
		
	}

