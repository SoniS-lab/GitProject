package stringstringbufferstringbuilder;

public class ImmutableClass {
	
	int i;
	
	public ImmutableClass(int i)
	{
		this.i=i;
	}

	public ImmutableClass modify(int i)
	{
		if (this.i==i) {
			return this;
		}
		else {
			return new ImmutableClass(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableClass im= new ImmutableClass(10);
		ImmutableClass im1=im.modify(10);
		System.out.println(im==im1);
		
		ImmutableClass im2= new ImmutableClass(12);
		System.out.println(im==im2);
	}

}
