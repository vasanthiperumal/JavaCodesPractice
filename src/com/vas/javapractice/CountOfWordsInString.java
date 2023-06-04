package com.vas.javapractice;

import java.util.Arrays;

public class CountOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java Easy To Learn";
	
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr));
		String revString="";
		
		
		int i=0;
		for(String words:arr) {
			//String revWord="";
			//Approach1
//			for(i=words.length()-1;i>=0;i--)
//				{
//				revWord=revWord+words.charAt(i);
//				}
//			revString=revString+revWord+" ";
			
			//Approach2
			
			StringBuilder sb=new StringBuilder(words);
			sb.reverse();
			revString=revString+sb.toString()+" ";
		}
		System.out.println(revString);
		
	}

}
