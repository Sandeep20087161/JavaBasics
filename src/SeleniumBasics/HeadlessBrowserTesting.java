package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\UserData\\Documents\\software\\new\\chromedriver_win32\\geckodriver-v0.29.1-win32\\geckodriver.exe");	
		
		
		
		FirefoxOptions options=new FirefoxOptions();
		
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		WebDriver driver = new FirefoxDriver(options); 
		driver.get("https://www.myntra.com/");	//enter url
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle(); //get title
		
		System.out.println(title);
		
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[1]/span[2]")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
