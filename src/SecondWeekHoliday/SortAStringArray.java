package SecondWeekHoliday;

public class SortAStringArray {

	public static void main(String[] args) {
		
		String str = "where are you madamji";
		String[] str1 = str.split(" ");
		String temp =" ";
		for(int i =0;i<str1.length-1;i++)
		{
			for(int j =i;j<str1.length-1;j++)
			{
			if(str1[i].length() > str1[i+1].length())
			{
				temp = str1[i];
				str1[i]=str1[i+1];
				str1[i+1]=temp;
			}
		}

	}
		for(int i =0;i<str1.length;i++)
		{
			System.out.println( str1[i]+ " ");
		}
	}
}
