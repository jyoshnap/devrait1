package SecondWeekHoliday;

public class MethodTakesVariableNoOfMarksReturnsSum {

	public static void main(String[] args) {
		int a []= {65,67,87,45,76,56};
		//int a [] = {2,3,4,5};
		System.out.println(method(a));
		
}
	public static int method(int[] a )
	{
		int b =0;
		for(int i =0;i<a.length;i++)
		{
			b = b+a[i];
		}
		return b;
	}
}
