package com.forloop.example;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		//int number = 123456;
		Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt(); 
        sc.close();
		int reverse = 0;
		for (int number=n; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		if(n==reverse) {
			System.out.println("Number is Palindrome Number");
		}
		else {
			System.out.println("Number is not Palindrome Number");
		}
	}

}
