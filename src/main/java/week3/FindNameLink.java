package week3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNameLink {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElementByXPath("//input[@id='lst-ib']").sendKeys("deepthi",Keys.ENTER);
	List<WebElement> allLink=driver.findElementsByTagName("a");
	System.out.println(allLink.size());
	allLink.get(0).click();
	int count=1;
	for (WebElement qu:allLink)
	{
		String text = qu.getText();
		if (text.contains("deepthi")) {
			count++;
		}
	}
System.out.println(count);
 
	}}