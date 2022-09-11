package com.whileloop.example;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :");
        int number=sc.nextInt(); 
        sc.close();
	    int reverse = 0;
	    int remainder;
		while(number != 0)   
		{  
		remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
