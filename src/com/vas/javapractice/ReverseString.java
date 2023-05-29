package com.vas.javapractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		
		String s="Zebra";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	}
}
