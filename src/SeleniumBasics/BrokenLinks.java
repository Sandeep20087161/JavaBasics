package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "\\\\solon.prd\\files\\P\\Global\\Users\\C23301\\UserData\\Documents\\software\\new\\chromedriver_win32\\geckodriver-v0.29.1-win32\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.amazon.com");	//enter url
		
		//Print all the links
		/*
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int linkSize=linklist.size();
		System.out.println("size is "+linkSize);
		for(int i =0;i<linkSize-1;i++) {
			
			String linkText= linklist.get(i).getText();
		System.out.println(linkText);
		}
		
		*/
		
		//Print all the images
		List<WebElement> ImzList = driver.findElements(By.tagName("img"));
		int ImgSize = ImzList.size();
		System.out.println("ImgSize"+ImgSize);
		for(int j =0;j<ImgSize-1;j++) {
			
			String ImgText= ImzList.get(j).getText();
		System.out.println(ImgText);
		}
		
		
		
		
	}

}
