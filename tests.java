package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tests {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com");
		driver.manage().window().maximize();
		  
		
	}
	@Test
	public void main()
	{
		wappalyzer w=new wappalyzer(driver);
		w.click();
	}
	@AfterTest
	public void quit()
	{
		
	}



}
