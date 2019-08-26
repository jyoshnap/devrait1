package SecondWeekHoliday;

public class MethodTakesArrayofIntValuesReturnLIst {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40};
		System.out.println(method(a));
	}
	public static int method(int[] a )
	{
		int i =0;
		int b = 0;
		for(;i<a.length-1;i++)
		{
			b = b+ a[i];
			System.out.println(a[i]);
		}
		return b;
	}

}
