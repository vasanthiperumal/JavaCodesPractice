package com.vas.javapractice;

import java.util.Arrays;

public class StringOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JavA Concepts Java Program";
		
		//occurrences of a character in string
		int total_length=s.length();
		int length_after_replace=s.replaceAll("[aA]","").length();
		
		int count=(total_length)-(length_after_replace);
		System.out.println(count);
		
		//no. of words in a sentence approach1
		
		String arr[]=s.split(" ");
	//	System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		//no. of words in a sentence approach2
		int countOfWords=1;
		for(int i=0;i<s.length();i++) {
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
			countOfWords++;
		}
		}
		System.out.println(countOfWords);
		
			
}

}
