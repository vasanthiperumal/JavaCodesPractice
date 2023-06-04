package com.vas.javapractice;

public class OddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,22,3,4,5,6,77,8,9,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
	//	even numbers
			if(arr[i]%2==0) {
				System.out.println("even: "+arr[i]);
				sum=sum+arr[i];
			}
		//odd numbers	
//			else {
//				System.out.println("odd: "+arr[i]);
//			}
		//two digit numbers
//			if(arr[i]>9&&arr[i]<100) {
//				System.out.println("Two digit number :"+arr[i]);
			}
		System.out.println("Even sum :"+sum);
		}
	}


