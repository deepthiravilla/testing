package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://jqueryui.com/selectable/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//WebElement eleFrame=driver.findElementByClassName("demo-frame");
	//enter into the frame
	//driver.switchTo().frame(eleFrame);
	//driver.findElementByXPath("//li[text()='Item 2']");
	//to come out of the frame
	//driver.switchTo().defaultContent();
	//driver.switchTo().parentFreame();
	//driver.findElementByLinkText("Download").click();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("//button[text()='Try it']").click();
	driver.switchTo().alert().sendKeys("deepthi");
	driver.switchTo().alert().accept();
	String text=driver.findElementById("demo").getText();	
	System.out.println(text);

	
	if(text.contains("Hello deepthi! How are you today?"))
	{
		System.out.println("text is matched");
	}else
	{
		System.out.println("text is not matched");
	}
	

			
}
}
