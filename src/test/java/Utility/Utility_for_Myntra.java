package Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_for_Myntra {
	public static String getdata(int row,int cell) throws Throwable, Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\care system\\Music\\Myntra.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(row).getCell(cell).getStringCellValue();
		return data;
		
		
	}

}
