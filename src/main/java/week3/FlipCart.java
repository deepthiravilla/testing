package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipCart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement eleElec = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		WebElement eleOppo = driver.findElementByXPath("//a[contains(text(),'OPPO')]");
		
		Actions builder =new Actions(driver);
		builder.moveToElement(eleElec).pause(2000).click(eleOppo).perform();
		
			
		
		
		
	}
	
}
