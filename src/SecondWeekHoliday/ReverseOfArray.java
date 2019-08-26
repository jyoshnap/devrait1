package SecondWeekHoliday;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOfArray {

	public static void main(String[] args) {
		 /*Integer [] arr = {10, 20, 30, 40, 50}; 
	        reverse(arr); 

	}*/
	/*function reverses the elements of the array*/
    /*static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
    
   */
    int [] a = {10,2,3,7,5,8,9};
    Arrays.sort(a);
    for(int i = 0;i<a.length;i++)
    {
    	System.out.print(a[i]);
    }
    System.out.println("-----------------");
    for(int i = a.length-1;i>=0;i--)
    {
    	System.out.print(a[i]);
    }

}
}
