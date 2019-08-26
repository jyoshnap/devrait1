package SecondWeekHolidaySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CopyColtoCol {

	
	static FileInputStream fis;
	static FileOutputStream fos;
	static Workbook wb;
	public static void main(String[] args) throws IOException {
		fis = new FileInputStream("./data/test.xlsx");
		wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rnum = sheet.getLastRowNum();
		System.out.println(rnum);
		for(int i =0;i<=sheet.getLastRowNum();i++)
		{
			String c = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String d = wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			wb.getSheet("Sheet1").getRow(i).createCell(2).setCellValue(c);
			wb.getSheet("Sheet1").getRow(i).createCell(3).setCellValue(d);
			fos=new FileOutputStream("./data/test.xlsx");
			wb.write(fos);	
		}
		fis.close();	
	}

}
