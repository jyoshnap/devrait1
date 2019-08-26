package javagold;

public class Inher extends A {
public static void main(String[] args)
{
	System.out.println(b);
	 Inher s = new Inher();
	 System.out.println(s.a);
	 Inher.m1();
	 A.m1();
	 s.m2();
	
}

}

class A {
	int a = 10;
	static int b = 20;
	static void m1()
	{
		System.out.println("From static method of A class");
	}
	void m2()
	{
		System.out.println("From Non-static method of A class ");
	}
}
