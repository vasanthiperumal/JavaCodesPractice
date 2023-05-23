package OtherPrograms;

public class StringSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="hello";
		
		String s3=new String("hello");
		String s4=new String("hello");//creates new object every time in memory
		
		System.out.println(s.equals(s1));//checks content--true
		System.out.println(s==s1);//checks reference-true
		System.out.println(s.equals(s3));//checks content--true
		System.out.println(s==s3);//checks reference-true
		System.out.println(s3==s4);//different references bcz of String class
		System.out.println(s3.equalsIgnoreCase(s4));//checks content-true
		System.out.println(s3.toUpperCase());
				
		StringBuffer sb=new StringBuffer("hello"); //synchronized and thread safe/
		System.out.println(sb.append("world"));
		System.out.println(sb.insert(5,"$"));
		System.out.println(sb.replace(2, 4, "ss"));
		System.out.println(sb.deleteCharAt(5));
		System.out.println(sb.reverse());
		
		StringBuilder sbb=new StringBuilder("telugu"); //non synchronized/not thread-safe/sequential
		System.out.println(sbb.reverse()); 
		
		
		
	}

}
