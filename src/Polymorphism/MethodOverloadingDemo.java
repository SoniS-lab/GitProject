package Polymorphism;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading md = new MethodOverloading();
		// md.add(10, 10); Ambiguous call
		md.add(10, 10.5f);
		md.add(10.5f, 10);

		// md.add(10.f,10.5f); not applicable for float as float cannot be casted to int
		// md.StringMethod(null); ambiguous call as string and stringbuffer both are
		// children of Object class

		md.StringMethod("Soni");
		md.StringMethod(new StringBuffer("Soni"));

    
		md.test(10);
		
		md.test(10,10,20,0);
		
		md.test();
		
		Animal a= new Animal();
		Lion l= new Lion();
		Animal al= new Lion();
		
		
		md.AnimalMethod(a);
		md.AnimalMethod(l);
		md.AnimalMethod(al);
	}

}
