package com.vas.javapractice;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"vas","sug","roshi","vas","sug"};
		
		//Approach 1
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Duplicate element: "+arr[i]);
//				}
//			}
//		}
		
		//Approach 2-Hashset
		HashSet<String> elements=new HashSet<String>();
		boolean status=false;
		for(String s:arr) {
			if(elements.add(s)==false) {
				System.out.println("Duplicate element: "+s);
				status=true;
			}
		}
		if(status==false) {
			System.out.println("No duplicate entries found");
		}
		
		
		
		
	}

}
