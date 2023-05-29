package com.vas.javapractice;

public class SkipCharByTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String enc = "";

		String s = "Zebra";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'y' || c == 'z' || c == 'Y' | c == 'Z')
				c -= 26;

			c += 2;
			enc = enc + c;

		}
		System.out.println(enc);
	}

}
