package com.vas.javapractice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
	//	int rev=0;
		
//		while(num>0) {
//			rev=(rev*10)+(num%10);
//			num=num/10;
//			}
		
	//	System.out.println(rev);
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
		
		StringBuilder sbl=new StringBuilder(num);
		sbl.append(num);
		System.out.println(sbl.reverse());
	
	}
}
