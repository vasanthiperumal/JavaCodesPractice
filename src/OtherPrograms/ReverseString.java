package OtherPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="malayalam";
		String t="";
		String s="Hello World";
		int countCap=0;
		int countSmall=0;
		for(int i=s.length()-1;i>=0;i--) {
		//	System.out.print(s.charAt(i));
			char k=s.charAt(i);
			t=t+k;
			if(Character.isUpperCase(k)) {
				countCap++;
			}
			else if(Character.isLowerCase(k)){
				countSmall++;
			}
			
		}
		System.out.println("countCap "+countCap);
		System.out.println("countSmall "+countSmall);
		System.out.println(t);
		if(s.equals(t)) 
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
