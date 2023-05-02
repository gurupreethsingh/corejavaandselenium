package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Reading_data implements Constants
{
   public static String getdata(String sheetname, int rownumber, int cellnumber) {
	   String v = "";
	   try {
		  //path, sheetname, sheetnumber, rownumber, cellnumumber, stringcellvalue. 
		   FileInputStream fis = new FileInputStream(excelsheetaddress);
		   Workbook wb = WorkbookFactory.create(fis);
		   v = wb.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   
	  return v;
   }
}
