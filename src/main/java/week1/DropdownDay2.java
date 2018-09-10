
package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDay2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElementByLinkText("Drop down").click();
		//first dropdown
		WebElement dropdown1 = driver.findElementById("dropdown1");
		Select dropdownIndex = new Select(dropdown1);
//		dropdownIndex.selectByIndex(3);
		WebElement selectedoptions = dropdownIndex.getFirstSelectedOption();
		System.out.println(selectedoptions.getText());
		//2nd drop down
//		WebElement dropdown2 = driver.findElementByName("dropdown2");
//		Select dropdownText = new Select(dropdown2);
//		dropdownText.selectByVisibleText("Appium");
//		//3rd drop down
//		WebElement dropdown3 = driver.findElementById("dropdown3");
//		Select dropdownValue = new Select(dropdown3);
//		dropdownValue.selectByValue("4");
//		//4th drop down
//		WebElement dropdown4 = driver.findElementByClassName("dropdown");
//		Select dropdownOptions = new Select(dropdown4);
//		dropdownOptions.selectByValue("1");
////		priting all the drop down option
//		List<WebElement> allOptions = dropdownOptions.getOptions();
//		int count = allOptions.size();
//		dropdownOptions.selectByIndex(count-1);
//		System.out.println(count);
//		for(int i=0; i<count;i++)
//		{
//			System.out.println(allOptions.get(i).getText());
//		}
//		//priting all the options
//		for(WebElement eachOption: allOptions)
//		{
//			System.out.println(eachOption.getText());
//		}
//		//Selecting using sendkeys method
//		List<WebElement> selectTagsSendKey = driver.findElementsByTagName("select");
////		System.out.println(selectTagsSendKey.size());
////		System.out.println(selectTagsSendKey.get(4).getText());
//		selectTagsSendKey.get(4).sendKeys("Appium");
//		
//		//script for multiselect drop down
//		List<WebElement> selectTags = driver.findElementsByTagName("select");
//		Select dropdownMulti = new Select(selectTags.get(5));
//		String arr[] = {"Loadrunner", "Appium"};
//		for(String val : arr) {
//			dropdownMulti.selectByVisibleText(val);
//			selectTags.get(5).sendKeys(Keys.CONTROL);
//		}


	}

}



