package SecondWeekHoliday;

public class AMethodWhichReturnTwoValues {

	public static void main(String[] args) {
		
			int[] a = method(100);
			for(int i =0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}
	public static int[] method(int money) {
		int[] a = {10,20};
		return a ;	
	}
}
