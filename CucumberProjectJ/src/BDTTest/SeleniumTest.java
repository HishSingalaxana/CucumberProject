package BDTTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleniumTest {
	
	private WebDriver driver;
	private String baseURL;
	private String browserName;
	private String browserVersion;
	private String result;
	private int resultCount;
	
	public void setUp() throws Exception{
		
		driver = new FirefoxDriver();
		
		baseURL = "http://www.cinglevue.com";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Capabilities caps = ((RemoteWebDriver)driver).getCapabilities();
		browserName = caps.getBrowserName();
		browserVersion = caps.getVersion();
		System.out.println("Automated test run. We're running on "+browserName+" "+browserVersion);
		
	}
	
	public void tearDown(){
		
		driver.quit();
		
	}
	
	public void goToSite(){
		
		driver.get(baseURL);
		
	}
	
	public void searchCinglevue(){
		
		driver.findElement(By.cssSelector("#edit-search-block-form--2")).clear();
	    driver.findElement(By.cssSelector("#edit-search-block-form--2")).sendKeys("cinglevue");
	    driver.findElement(By.cssSelector("#edit-search-block-form--2")).sendKeys(Keys.RETURN);
		
	}
	
	public void checkResult(){
		
		result = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/p")).getText().split(" ")[2];
		resultCount = Integer.parseInt(result);
		
		if (resultCount>10){
			System.out.println("This Test is Successful.");
		}
		else {
			System.out.println("This Test is not Successful.");
		}
	}
	

}
