package javagold;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding;

public class MethodOVerRIding extends S {
	
	void method()
	{
		System.out.println("From method over riding class");
	}
	public static void main(String[] args)
	{
		S obj1 = new S();
		obj1.method();
		 MethodOVerRIding obj2 = new MethodOVerRIding();
		 obj2.method();
	}
}

class S
{
	void method()
	{
		System.out.println("From s class");
	}
}



