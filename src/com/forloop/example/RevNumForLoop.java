package com.forloop.example;

import java.util.Scanner;

public class RevNumForLoop {
	public static void main(String[] args) {
		// int number = 123456;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int n = sc.nextInt();
		sc.close();
		int reverse = 0;
		int remainder;
		// we have not mentioned the initialization part of the for loop
		for (int number = n; number != 0; number = number / 10) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
