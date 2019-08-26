package SecondWeekHolidaySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CopySheettoSheet2 {

	static FileInputStream fis;
	static FileOutputStream fos;
	static Workbook wb ;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path ="./data/test.xlsx";
		String sheet1 ="Sheet1";
	}
		public void data(String path,String sheet1, String sheet2) throws EncryptedDocumentException, IOException {
	
		fis = new FileInputStream("path");
		wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheet1);
		int rnum = sheet.getLastRowNum();
		System.out.println(rnum);
		for(int i =0;i<rnum;i++)
		{
			int cellnum = wb.getSheet(sheet1).getRow(i).getLastCellNum();
			//System.out.println(cellnum);
			
			for(int j = 0;j<cellnum;j++)
			{
				String c = wb.getSheet(sheet1).getRow(i).getCell(j).toString();
				System.out.println(c);
				//wb.getSheet(sheet2).getRow(i).createCell(j).setCellValue(c);
				wb.getSheetAt(1).getRow(i).createCell(j).setCellValue(c);
				fos=new FileOutputStream(path);
				wb.write(fos);
			}
			
		}
		fis.close();
		}
	}


