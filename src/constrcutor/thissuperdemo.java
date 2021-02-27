package constrcutor;

import java.io.IOException;


class ClassParent {
	
	  public ClassParent() throws IOException{ // TODO Auto-generated constructor
	 // this(10); System.out.println("Inside default constructor");
	  }

	 

	public ClassParent(int a) {
		// TODO Auto-generated constructor stub
		// this();
		System.out.println("Inside parameterized constructor");
	}

}

class ClassChild extends ClassParent {
	private ClassChild() throws IOException  {
		super();
	}
}

public class thissuperdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
