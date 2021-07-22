package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop=new Properties();
		FileInputStream ip =new FileInputStream("\\\\SOLON.PRD\\files\\P\\Global\\Users\\C23301\\Userdata\\Documents\\Sandeep_EclipseWorkspace\\SeleniumSession\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("firstName"));
		System.out.println(prop.getProperty("lastName"));
		
		
		
		System.setProperty("webdriver.gecko.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\UserData\\Documents\\software\\new\\chromedriver_win32\\geckodriver-v0.29.1-win32\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		driver.findElement(By.xpath(prop.getProperty("cookieAccept_link_xpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("makeAnAcc_link_xpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		
		List<WebElement> days = driver.findElements(By.xpath(prop.getProperty("days_xpath")));
		int totalDays=days.size()-1;
		System.out.println(totalDays);
		
		for(int k=1;k<=totalDays;k++) {
			String currencyVal=days.get(k).getText();
			System.out.println(currencyVal);
			}
		
		
	}

}
