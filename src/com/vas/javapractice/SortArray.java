package com.vas.javapractice;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a= {2,6,5,1,3};
		//int n=a.length;
		//System.out.println("Array before sort: "+ Arrays.toString(a));
		//Approach 1-Bubble Sort
//		for(int i=0;i<n-1;i++) {	//no. of passes
//			for(int j=0;j<n-1;j++) { //no. of iterations
//			if(a[j]>a[j+1]) {
//				int temp=a[j];
//				a[j]=a[j+1];
//				a[j+1]=temp;
//			}
//			}
//		}
//		System.out.println("Array after sort: "+ Arrays.toString(a));
		
		//Approach 2 Arrays.sort
		
		//Arrays.sort(a);
//		Arrays.sort(a,Collections.reverseOrder());
//		System.out.println("Array after sort: "+ Arrays.toString(a));
		
		//Approach 3 
		
		int arr[]= {3,7,2,5,6};
				
		System.out.println("Array before sort: "+ Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//System.out.println(arr[i]); 
		}
		System.out.println("Array after sort: "+ Arrays.toString(arr));
	}
}
