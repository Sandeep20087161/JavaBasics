package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printDropdownValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\UserData\\Documents\\software\\new\\chromedriver_win32\\geckodriver-v0.29.1-win32\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.goindigo.in/");
		Thread.sleep(5000);//enter url
		List<WebElement> listSize = driver.findElements(By.id("ctl00_mainContent_DropDownListCurrency"));
		//int TotalElemntsSize= listSize.size();
		System.out.println(listSize.size());
	}

}
