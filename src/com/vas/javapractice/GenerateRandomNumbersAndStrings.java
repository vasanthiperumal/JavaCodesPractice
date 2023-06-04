package com.vas.javapractice;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Random
		Random random=new Random();
		int rand_int=random.nextInt(100);
		System.out.println(rand_int);
		
		//2.Math
		System.out.println(Math.random());
		
		//3.apache.commons.lang
		
	}
}
