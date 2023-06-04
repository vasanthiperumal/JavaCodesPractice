package com.vas.javapractice;

public class StringAsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Vasanthi11 Automation22";
		int capCount=0;
		int smallCount=0;
		int digitCount=0;
		
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			
			//System.out.println(c); //print all characters of string
			//System.out.println(c+" "+(int)c); //print ascii value of string
			//print uppercase characters of string
			if(Character.isUpperCase(c))
			{
				capCount++;
			}
			else if(Character.isLowerCase(c))
			{
				smallCount++;
			}
			else if(Character.isDigit(c)){
				digitCount++;
			}
		}
		System.out.println("Count of Upper Case :"+capCount);
		System.out.println("Count of Lower Case :"+smallCount);
		System.out.println("Count of Lower Case :"+digitCount);
		
		
	}
}


