package com.vas.javapractice;

public class MissingElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,9,11};
		
		int size=arr.length;
		int count=0;
		
		for(int i=arr[0];i<=arr[size-1];i++) {
			if(arr[count]==i) {
				count++;
			}
			else {
				System.out.println(i+" ");
			}
		}
	}
}
