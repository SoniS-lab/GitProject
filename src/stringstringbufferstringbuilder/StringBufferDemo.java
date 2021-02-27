package stringstringbufferstringbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		
		StringBuffer sb12= new StringBuffer(32);
		System.out.println(sb12.capacity());
		
		StringBuffer sb2= new StringBuffer("Test");
		System.out.println(sb2.capacity());
		
		System.out.println(sb2.length());
		
		System.out.println(sb2.charAt(2));
		sb2.setCharAt(3, 'd');
		System.out.println(sb2);
		
		sb2.deleteCharAt(3);
		System.out.println(sb2);
		
		System.out.println(sb2.reverse());
		
		sb2.insert(2, "hi");
		System.out.println(sb2);
		
		sb2.delete(0, 3);
		System.out.println(sb2);
		System.out.println(sb2.append("  Reach"));
		System.out.println(sb2);
		sb2.setLength(2);
		System.out.println(sb2);
		
		sb2.ensureCapacity(1000);
		System.out.println(sb2.capacity());
		
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		
		StringBuffer sb3= new StringBuffer("Test");
		StringBuffer sb4= new StringBuffer("Test");
		
		System.out.println(sb3==sb4);
		System.out.println(sb3.equals(sb4));
		
	}

	
}
