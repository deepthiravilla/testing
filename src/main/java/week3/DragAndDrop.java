package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0);
		//WebElement drag = driver.findElementById("draggable"); 
		//WebElement drop = driver.findElementById("droppable"); 
		
		//Actions builder =new Actions(driver);
		//builder.dragAndDrop(drag,drop).perform();
		
		
		
		//driver.get("https://jqueryui.com/draggable/");
		//driver.switchTo().frame(0);
		//WebElement drag = driver.findElementById("draggable");
		
		//int x=drag.getLocation().x;
		//int y=drag.getLocation().y;
		//System.out.println(x);
		//System.out.println(y);
		//Actions builder =new Actions(driver);
		//builder.dragAndDropBy(drag,40,40).perform();
		
		driver.get("https://jqueryui.com/Sortable/");
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement ele2 = driver.findElementByXPath("//li[text()='Item 4']");
		Actions builder =new Actions(driver);
		int y=ele2.getLocation().getY();
		
		builder.dragAndDropBy(ele1,0,y).release().perform();
		
		

		
	
		
		
	}
}


		

        
       // Thread.sleep(2000);
      //  robot.mouseMove(source.getLocation().getX(), source.getLocation().getY());

