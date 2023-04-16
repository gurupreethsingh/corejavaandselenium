package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingdata implements Constants {
public static String getdata(String sheetname,int rownum,int cellnum)
{
	String v = "";
	try
	{
		FileInputStream f = new FileInputStream(excelsheetaddress);
		Workbook wb = WorkbookFactory.create(f);
		v=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return v;
}
}
