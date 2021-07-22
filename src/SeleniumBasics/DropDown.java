package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\UserData\\Documents\\software\\new\\chromedriver_win32\\geckodriver-v0.29.1-win32\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//button[@title='Alles accepteren']")).click();
		driver.findElement(By.xpath("//a[text()='Nieuw account maken']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname' and @placeholder='Voornaam']")).sendKeys("Sandeep");
		WebElement day =driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByVisibleText("11");
		
		
		
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));
		int totalDays=days.size()-1;
		System.out.println(totalDays);
		
		for(int k=1;k<=totalDays;k++) {
			String currencyVal=days.get(k).getText();
			System.out.println(currencyVal);
			}
		
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']//option"));
		int totalMonths=months.size();
		System.out.println(totalMonths);
		
		for(int k=0;k<=totalMonths-1;k++) {
			String currencyVal=months.get(k).getText();
			System.out.println(currencyVal);
			}
		
		driver.findElement(By.xpath("//label[text()='Vrouw']")).click();
		
		
		/*
		//Select value from dropdown 
		WebElement currency =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(currency);
		select.selectByVisibleText("AED");
		
		//print all the values of a dropdown
		
		List<WebElement> listSize = driver.findElements(By.id("ctl00_mainContent_DropDownListCurrency"));
		//int TotalElemntsSize= listSize.size();
		System.out.println(listSize.size());
		*/
	}

}
