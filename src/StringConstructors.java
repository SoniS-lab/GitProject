
public class StringConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= new String();
		System.out.println(s);
		System.out.println(s.equals(""));
		String s1=new String("Soni");
		System.out.println(s1);
		
		StringBuffer sb= new StringBuffer("Soni");
		
		StringBuilder sb1= new StringBuilder("String Builder");
		
		
		String s2= new String(sb);
		System.out.println(s2);
		
		char []ch= {'q'};
		String sc= new String(new char[]{'S','O','N','I'});
		System.out.println(sc);
		
		String bc=new String(new byte[] {65,66,64,78});
		
		System.out.println(bc);
		
		

		
	}

}
