package SeleniumBasics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils1 {

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
