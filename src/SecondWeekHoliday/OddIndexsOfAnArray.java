package SecondWeekHoliday;

import java.util.Arrays;
import java.util.Collections;

public class OddIndexsOfAnArray {

	public static void main(String[] args) {
    int [] a = {10,2,3,7,5,8,9};
    Arrays.sort(a);
    for(int i = 0;i<a.length;i++)
    {
    	if(a[i]%2 != 0)
    	System.out.print(a[i]);
    }
    System.out.println("-----------------");
    for(int i = a.length-1;i>=0;i--)
    {
    	System.out.print(a[i]);
    }

}
}
