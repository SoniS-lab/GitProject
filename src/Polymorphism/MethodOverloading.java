package Polymorphism;

class Animal{
	{
		
		
	}
}
class Lion extends Animal
{
	

}
public class MethodOverloading {
	
	public void add(int a, float b)
	{
		System.out.println("Inside int float method");
	}
	public void add(float a, int b)
	{
		System.out.println("Inside float int method");
	}
	
	public void StringMethod(String s)
	{
		System.out.println("Inside String method");
	}

	public void StringMethod(StringBuffer s)
	{
		System.out.println("Inside String Buffer method");
	}
	
    //var arg method
	
		public void test(int a)
		{
			System.out.println("Inside normal test method");
		}
		public void test(int ... a)
		{
			System.out.println("Inside var arg test method");
		}
		
		//Paren and child objects references as parameters
		// In method overloading runtime polymorphism is dummy. The method call is resolved by compiler based on reference
		
		public void AnimalMethod(Animal a)
		{
			System.out.println("Inside animal parent method");
		}
		public void AnimalMethod(Lion a)
		{
			System.out.println("Inside animal lion method");
		}
		
}
