package com.vas.javapractice;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		
		int search_ele=60;
		boolean status=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search_ele){
				System.out.println("Search element found at index "+i);
				status=true;
			}
		}
		if(status==false) {
			System.out.println("Element not found");
		}

	}

}
