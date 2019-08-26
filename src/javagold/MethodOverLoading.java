package javagold;

public class MethodOverLoading {

	public static void main(String[] args) {
		largest(10,20,30);
		System.out.println(largest(2,3,5,7));
		largest(2,3.4);
		
		
	}
	static void largest(int a,int b,int c){
		System.out.println("largest with 2 arguments");
	}
	
	static int largest(int a,int b,int c,int d){
		return 10;
	}
	
	static void largest(int a,double b)
	{
		System.out.println("form double argument method ");
	}

}
