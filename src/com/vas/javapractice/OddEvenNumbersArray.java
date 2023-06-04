package com.vas.javapractice;

public class OddEvenNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]+" is even");
//			}
//			else {
//				System.out.println(arr[i]+" is odd");
//			}
//		}
		System.out.println("Even numbers in array: ");
		for(int value:arr) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		System.out.println("Odd numbers in array: ");
		for(int value:arr) {
			if(value%2!=0) {
				System.out.println(value);
			}
		}
		
	}

}
