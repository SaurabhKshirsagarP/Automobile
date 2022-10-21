package saurabh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramatrization {
public static String getExcelData(int row ,int cell,String SheetName) throws Exception {
	FileInputStream file = new FileInputStream("D:\\Exel\\Book1.xlsx") ;
	String value = WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	
	return value;







}
}
