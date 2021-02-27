package Polymorphism;

import java.io.IOException;

class OverridingParent
{
	private void test()
	{
		System.out.println("Parent private method");
	}
	
	public final void finalMethod()
	{
		System.out.println("Inside final method");
	}
	public void scopTest() throws IOException
	
	{
		
	}
	public static void testStaticMethod() {
		System.out.println("Test static method");
	}
}
class OverridingChild extends OverridingParent
{
	 void test()
	{
		System.out.println("Child private method");
	}
	 //Final methods cannot be overriden 
	/*
	 * public void finalMethod() {
	 * 
	 * }
	 */
	 public void scopTest() throws IOException  
		
		{
			//throw new IOException();
		}
	 public static void testStaticMethod() {
			System.out.println("Test static method");
		}
}
public class MethodOveriding {
	

	public static void main(String[] args) {

		OverridingParent op= new OverridingParent();
		OverridingParent op1= new OverridingChild();
		OverridingChild oc= new OverridingChild();
	
	}
}
