package com.vas.javapractice;

public class MaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {24,6,1,13,35,18};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Min in Array :"+min);
		System.out.println("Max in Array :"+max);
	}

}
