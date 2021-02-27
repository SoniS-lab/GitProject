package stringstringbufferstringbuilder;

import java.util.Scanner;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="Soni Shirwani";
		
		System.out.println(s.charAt(3));
		
		String s1="Soni",s2="Soni";
		
		System.out.println(s1.equals(s2));
		
		String empty="";
		
		System.out.println(empty.isEmpty());
		
		System.out.println(s.length());
		
		System.out.println(s.replace("i", "y"));
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,8));
		
		System.out.println(s.indexOf('n'));
		
		System.out.println(s.lastIndexOf('n'));
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		Scanner ss= new Scanner(System.in);
		String input=ss.nextLine();
		
		System.out.println(input.trim());
		
		final String s1f="final";
		final StringBuffer sb1= new StringBuffer("asd0");
		sb1.append("tets");
		
		
		
		
	}

}
