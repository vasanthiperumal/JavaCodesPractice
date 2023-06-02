package com.vas.javapractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		
		String s="Zebra";
		
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			rev=c+rev;
//		}
//		System.out.println(rev);
		
//		for(int i=s.length()-1;i>=0;i--) {
//			char c=s.charAt(i);
//			rev=rev+c;
//			}
//		System.out.println(rev);
		
				
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		StringBuilder sbl=new StringBuilder(s);
		System.out.println(sbl.reverse());
		
		char a[]=s.toCharArray();
		int size=a.length;
		
		
		for(int i=size-1;i>=0;i--) {
			rev=rev+a[i];						
		}
		
		System.out.println(rev);
	}
}
