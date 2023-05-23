package OtherPrograms;

public class StringExample {

	public static void main(String[] args) {
		// String is pre-built class in Java
		// two ways to define
		// 1.string literal===when new string is declared, checks for same string and
		// refers to the existing string
		// 2.new object of String class===new object is created every time

		String s = "hello";
		s = s.concat(" world");
		
		String s1="vasanthi@qa@automation";
		System.out.println(s);
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf("o"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(0,5));
		String arr[]=s1.split("@");
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(s1.replaceAll("@", "*"));
		System.out.println(s.length());
		
		String st="vasan";
		String t="";
		
		for(int i=st.length()-1;i<=0;i--)
		{
			t = t + st.charAt(i);
		}
		System.out.println(t);
		
	
		
	}
}
