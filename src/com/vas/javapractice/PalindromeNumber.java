package com.vas.javapractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int rev=0;
		int orig_num=num;
		
		while(num>0) {
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		
		System.out.println(rev);
		
		if(orig_num==rev) {
			System.out.println("Number is a palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
		
	}

}
