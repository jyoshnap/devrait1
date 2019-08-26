package SecondWeekHolidaySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CopySheettoSheet {

	static FileInputStream fis;
	static FileOutputStream fos;
	static Workbook wb ;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream("./data/test.xlsx");
		wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		//Sheet sheet2 = wb.getSheet("Sheet2");
		int rnum = sheet.getLastRowNum();
		System.out.println(rnum);
		for(int i =0;i<sheet.getLastRowNum();i++)
		{
			int cellnum = wb.getSheet("Sheet1").getRow(i).getLastCellNum();
			//System.out.println(cellnum);
			
			for(int j = 0;j<cellnum;j++)
			{
				String c = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				System.out.println(c);
				wb.getSheet("Sheet2").getRow(i).createCell(j).setCellValue(c);
				
			}
			
		}
		fos=new FileOutputStream("./data/test.xlsx");
		wb.write(fos);
			
	}

}
