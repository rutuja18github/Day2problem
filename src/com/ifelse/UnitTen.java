package com.ifelse;

import java.util.Scanner;

public class UnitTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("enter number's like 1,10,100,1000 :");
        int n=sc.nextInt();
        sc.close();
        if(n==1) {
        	System.out.println("Unit");
        }
        else if(n==10) {
        	System.out.println("Ten");
        }
        else if(n==100) {
        	System.out.println("Hundred");
        }
        else if(n==1000) {
        	System.out.println("Thousand");
        }
        else {
        	System.out.println("Enter valid Number");
        }
	}

}
