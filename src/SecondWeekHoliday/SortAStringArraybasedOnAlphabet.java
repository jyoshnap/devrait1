package SecondWeekHoliday;

public class SortAStringArraybasedOnAlphabet {

	public static void main(String[] args) {
		
		String str = "where are you madamji";
		String[] str1 = str.split(" ");
		String temp =" ";
		for(int i =0;i<str1.length;i++)
		{
			for(int j =i;j<str1.length-1;j++)
			{
			if(str1[j].compareTo(str1[j+1])>0)
			{
				temp = str1[j];
				str1[j]=str1[j+1];
				str1[j+1]=temp;
			}
		}

	}
		for(int i =0;i<str1.length;i++)
		{
			System.out.println( str1[i]+ " ");
		}
	}
}
