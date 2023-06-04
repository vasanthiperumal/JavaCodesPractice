package com.vas.javapractice;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="%^*#$ Java &&& Practice!!!";
		
		//s=s.replaceAll("[^A-Za-z0-9]","");
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
