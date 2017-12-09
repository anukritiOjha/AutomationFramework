package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib implements IAutoConstant{

	public static String getProperty(String CONFIG_PATH,String key){
		String property="";
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			prop.get(key);
			property=prop.getProperty(key);

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return property;
	}

	public static int getRowCount(String EXCEL_PATH,String sheet){

		int rowcount=0;

		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			rowcount=wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return rowcount;
	}

	public static String getCellValue(String EXCEL_PATH,String sheet,int row,int coloumn){

		String cellValue="";

		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			cellValue=wb.getSheet(sheet).getRow(row).getCell(coloumn).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return cellValue;

	}

}
