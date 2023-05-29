package com.vas.javapractice;

public class NumberFirstString {
	public static void main(String[] args) {
	
		String s="Ja1i Sr2i R3am";
		String sDigit="";
		String sAlpha="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				sDigit+=c;
			}
			else if(Character.isLetter(c)) {
				sAlpha+=c;
			}
		}
		String newString=sDigit+sAlpha;
		System.out.println(newString);
				
	}
}
