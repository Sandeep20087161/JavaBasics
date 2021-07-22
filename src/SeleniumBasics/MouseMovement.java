package SeleniumBasics;

import java.util.List;
//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		System.setProperty("webdriver.gecko.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\UserData\\Documents\\software\\new\\chromedriver_win32\\geckodriver-v0.29.1-win32\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);//enter url
		
		/*
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Hot Meals")).click();
		
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement noOFPassenger=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select select=new Select(noOFPassenger);
		select.selectByVisibleText("5");
		
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		
		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Varanasi (VNS)")).click();
		//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
		
		
		String day ="1";
		String dayVal=null;
		String beforeXpath="//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[";
		String afterXpath="]/td[";
		boolean flag = false;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=7;j++) {
				try{
				dayVal = driver.findElement(By.xpath(beforeXpath+i+afterXpath+j+"]/a")).getText();
				}catch (NoSuchElementException e){
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				
				if(dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath+i+afterXpath+j+"]/a")).click();
					flag = true;
					break;
				}
				
			}
			
			
			if(flag){
				break;
			}
			
		}
		
		
		*/
		
		
		String currency="USD";
		//Print All the values from currency dropdown
		
		List<WebElement> currencyValues = driver.findElements(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']//option"));
		int currencysize=currencyValues.size()-1;
		System.out.println(currencysize);
		
		for(int k=1;k<=currencysize;k++) {
			String currencyVal=currencyValues.get(k).getText();
			System.out.println(currencyVal);
			}
		
		//*[@id="ctl00_mainContent_DropDownListCurrency"]/option[1]
	}

}
