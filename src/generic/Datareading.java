package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datareading implements Constant {
	
	public static String getdata(String sheetname, int rownumber, int cellnumber) {
		String v="";
		try {
			FileInputStream fis=new FileInputStream(excelsheet);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheetname).getRow(cellnumber).getCell(cellnumber).getStringCellValue();		}
		catch(Exception ex) {
			
			ex.printStackTrace();
			
		}
		return v;
		
		
	}

}
