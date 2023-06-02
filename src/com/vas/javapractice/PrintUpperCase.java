package com.vas.javapractice;

public class PrintUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello1 World4";
		String newString="";
		int count=0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			
			if (!Character.isWhitespace(c)) {
				newString=newString+c;
				//System.out.println(c);
				//count++;
			}
			
		}
		//System.out.println(count);
		System.out.println(newString);
	}
}
