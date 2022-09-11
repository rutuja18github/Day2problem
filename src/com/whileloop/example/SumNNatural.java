package com.whileloop.example;

import java.util.Scanner;

public class SumNNatural {
	public static void main(String args[])
    {
        int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        s.close();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 

}
