package inheritance;


import modifiers.AccessTest;

public class InheritanceDemo extends AccessTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//overriding is not applicable for variables. The resolution would be provided by compiler based on reference type
	 Parent p= new Parent();
	 p.parentMethod();
	 System.out.println(p.s);
	 
	 Child c= new Child();
	 c.childMethod();
	 c.parentMethod();
	 c.childSpecificMethod();
	 System.out.println(c.s);
	 
	 Parent pc=new Child();
	 
	 pc.parentMethod();
	 System.out.println(pc.s);
	//ccessTest ac= new AccessTest();
	 
	InheritanceDemo id= new InheritanceDemo();
	
	AccessTest ac=new AccessTest();
	
	 id.test();

	}
	public void test()
	{
		System.out.println(this.test2);
	}

}
