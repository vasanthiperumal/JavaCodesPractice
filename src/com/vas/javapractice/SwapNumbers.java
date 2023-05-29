package com.vas.javapractice;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int t=0;
		
		System.out.println("Before swapping: a= "+a+" b= "+b);
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//System.out.println("Method 1: After swapping: a= "+a+" b= "+b);
		
//		t=a;
//		a=b;
//		b=t;
//		
//		System.out.println("Method 2: After swapping: a= "+a+" b= "+b);
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("Method 3: After swapping: a= "+a+" b= "+b);
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("Method 4: After swapping: a= "+a+" b= "+b);
		
		b=a+b-(a=b);
		System.out.println("Method 4: After swapping: a= "+a+" b= "+b);
		
		
	}

}
