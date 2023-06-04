package com.vas.javapractice;

public class NewStringFromGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldString="Hello26 World";
		String newString="";
		String d="",r="";
		
		for(int i=0;i<oldString.length();i++) {
			char c=oldString.charAt(i);
			if(Character.isDigit(c)) 
				d=d+c;
			else
				r=r+c;					
			}
		
		newString=d+r;
		System.out.println(newString);
	}
}
