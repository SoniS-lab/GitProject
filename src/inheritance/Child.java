package inheritance;



class Child extends Parent{

	String s="child";
	public void childMethod()
	{
		System.out.println("Inside child method");
	}
	public void parentMethod()
	{
		System.out.println("Inside parent overriden method");
	}
	
	public void childSpecificMethod()
	{
		System.out.println("Inside child specific method");
	}
}
