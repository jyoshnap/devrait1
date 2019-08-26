package SecondWeekHoliday;

import java.util.Arrays;
import java.util.Collections;

public class ToSumTheValuesinAnArray {

	public static void main(String[] args) {
    int [] a = {10,2,3,7,5,8,9};
    int sum = 0;
    Arrays.sort(a);
    for(int i = 0;i<a.length;i++)
    {
    	sum = sum+ a[i];
    }
    System.out.print(sum);
  }
}
