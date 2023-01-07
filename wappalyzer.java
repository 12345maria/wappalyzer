package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class wappalyzer {
By resources=By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span");
By technology=By.xpath("//*[@id=\"list-item-50\"]/div/div[1]");
By shopify=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[1]/div/div/div[1]");
By createreadlist=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a");
By technologies=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button");
By find=By.xpath("//*[@id=\"input-2954\"]");
WebDriver driver;
public wappalyzer(WebDriver driver)
{
	this.driver=driver;
}
public void click()
{
	WebElement resource=driver.findElement(resources);
	Actions act=new Actions(driver);
	act.moveToElement(resource).build().perform();
	resource.click();
	WebElement tech=driver.findElement(technology);
	tech.click();
	WebElement shop=driver.findElement(shopify);
	act.moveToElement(shop).build().perform();
shop.click();
driver.findElement(createreadlist).click();
driver.findElement(technologies).click();
driver.findElement(find).sendKeys("java");


	
	
	
}
}
