package constrcutor;

abstract class parent
{
	int p;

	
	/*
	 * public parent() { // TODO Auto-generated constructor stub
	 * System.out.println("Inside parent constructor"); }
	 */
	 
   parent(int p)
   {
	   this.p=p;
   }
}
class child extends parent
{
	public child(int r) {
		// TODO Auto-generated constructor stub
	super(10);
		System.out.println("Inside child constructor");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	parent p= new parent(10);
		child c= new child(10);
	}

}
