package stringstringbufferstringbuilder;

public class StringConstantPoolAndHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1=new String("You cannot change me");
		
		String s2=new String("You cannot change me");
		
		System.out.println(s1==s2);
		
		String s3="You cannot change me";
		
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
       String s4="You cannot change me";
		
		System.out.println(s3==s4);
		
		String s5="You cannot "+"change me";
		
		System.out.println(s4==s5);
		
		String s6="You cannot ";
		
		String s7=s6+"change me";
		System.out.println(s4==s7);
		
		final String s8="You cannot ";
		String s9=s8+"change me";
		
		System.out.println(s4==s9);
		
		char[] ch= {'J','A','V','A'};
		String s= new String(ch);
		System.out.println(s);
		
		String st=" ";
		System.out.println(st.isEmpty());
		
		StringBuilder sb1= new StringBuilder("Durga");
		
		
		
		
		
	}

}
