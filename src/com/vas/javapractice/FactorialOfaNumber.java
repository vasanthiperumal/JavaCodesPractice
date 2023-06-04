package com.vas.javapractice;

public class FactorialOfaNumber {
	
	//4!=4*3*2*1=24
	//$!=1*2*3*4=24

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int factorial=1;
		
		for(int i=num;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		
	}
}
