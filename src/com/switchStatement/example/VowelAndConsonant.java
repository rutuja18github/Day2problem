package com.switchStatement.example;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String args[]) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alphabet for check vowel or consonant :");
		ch = sc.next().charAt(0);
        sc.close();
		switch (ch) {
		// check lower case vowel letters
		case 'a':
			System.out.println(ch + " is a vowel");
			break;

		case 'e':
			System.out.println(ch + " is a vowel");
			break;

		case 'i':
			System.out.println(ch + " is a vowel");
			break;

		case 'o':
			System.out.println(ch + " is a vowel");
			break;

		case 'u':
			System.out.println(ch + " is a vowel");
			break;

		// check upper case vowel letters
		case 'A':
			System.out.println(ch + " is a vowel");
			break;

		case 'E':
			System.out.println(ch + " is a vowel");
			break;

		case 'I':
			System.out.println(ch + " is a vowel");
			break;

		case 'O':
			System.out.println(ch + " is a vowel");
			break;

		case 'U':
			System.out.println(ch + " is a vowel");
			break;

		default:
			if ((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
				System.out.println(ch + " is a consonant");
			} else {
				System.out.println(ch + " is not a Alphabets");
			}
			// System.out.println(ch + " is a consonant");
			break;

		}
	}

}
