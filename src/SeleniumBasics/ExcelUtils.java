package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtils {

	
	
	public static void main(String[] args) {
		getRowCountclass1();
	}
	
public static void getRowCountclass1()  {
	

	try {	
		String path = "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\Userdata\\Documents\\software\\Data.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow=sheet.getLastRowNum();
		System.out.println("No of rows" +lastRow);
		
	}catch(Exception e) {
	
		
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		e.printStackTrace();
		
	}

	
	

	
}
}
