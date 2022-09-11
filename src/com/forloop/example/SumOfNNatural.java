package com.forloop.example;

import java.util.Scanner;

public class SumOfNNatural {
	
	public static void main(String args[])
    {
        
        int sum = 0;
        System.out.print("Enter how many numbers :");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.close();
       for(int i=1;i<=x;i++)
        {
            sum = sum +i;
         
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 

}
