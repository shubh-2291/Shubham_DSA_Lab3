package com.lab3.assignment1;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expression...");
		String expression = sc.next();

		StackDs stackds = new StackDs();
		if (expression.length() % 2 == 1) {
			System.out.println("The Entered Expression do not contains Balanced Brackets");
		} else {
			if (stackds.validate(expression)) {
				System.out.println("The Entered Expression has Balanced Brackets");
			} else {
				System.out.println("The Entered Expression do not contains Balanced Brackets");
			}
		}

		sc.close();

	}

}
