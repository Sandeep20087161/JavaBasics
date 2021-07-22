package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\Userdata\\Documents\\modi\\chromedriver_win32\\chromedriver.exe");	
		//WebDriver driver = new ChromeDriver(); //launch chrome
		
		System.setProperty("webdriver.gecko.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\UserData\\Documents\\software\\new\\chromedriver_win32\\geckodriver-v0.29.1-win32\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.facebook.com");	//enter url
		
		String title = driver.getTitle(); //get title
		
		System.out.println(title);

	}

}
