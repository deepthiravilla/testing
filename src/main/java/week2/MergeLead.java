
package week2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException, IOException {
//		setting chrome driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		launching chrome browser
		ChromeDriver driver = new ChromeDriver();
//		load URL
		driver.navigate().to("http://leaftaps.com/opentaps");
//		driver.get("http://leaftaps.com/opentaps");
//		maximize browser
		driver.manage().window().maximize();
//		adding implicit wait to identify webelements within the specified time
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		enter user name
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
//		enter password
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
//		click login button
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
//		click crm/sfa link
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
//		click leads tap
		driver.findElementByXPath("//a[text()='Leads']").click();
//		click Merge button
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
//		click From lookup
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif'][1]").click();
//		get all the opened window references
		Set<String> allSetWindowRef = driver.getWindowHandles();
//		copy set value to list
		List<String> allListWindowRef = new ArrayList<String>();
		allListWindowRef.addAll(allSetWindowRef);
//		switch to the newly opened window
		driver.switchTo().window(allListWindowRef.get(1));
//		enter first name
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("kos");
//		click find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		to avoid stale element exception using Thread.sleep method
		Thread.sleep(3000);
//		fetch first displayed id
		String firstLeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").getText();
		System.out.println("First lead id: "+firstLeadID);
//		click first displayed lead id
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
//		get all the window reference to switch back to original window
		allSetWindowRef = driver.getWindowHandles();
//		copy set to list
		allListWindowRef = new ArrayList<String>();
		allListWindowRef.addAll(allSetWindowRef);
//		switch to original window
		driver.switchTo().window(allListWindowRef.get(0));
//		verify the first displayed id entered in the text box after fetching
		String verifyFirstName = driver.findElementByXPath("//input[@id='ComboBox_partyIdFrom']").getAttribute("value");
		if(verifyFirstName.equals(firstLeadID))
		{
			System.out.println("First lead id is entered correctly in the From lead text box: "+verifyFirstName);
		}
		else
		{
			System.out.println("First lead id is not entered correctly in the From lead text box: "+verifyFirstName);
		}
//		click To lead button
		driver.findElementByXPath("//span[text()='To Lead']//following::a/img[@src='/images/fieldlookup.gif']").click();
//		Thread.sleep(3000);
//		get all the opened window references
		allSetWindowRef = driver.getWindowHandles();
//		copy set value to list
		allListWindowRef = new ArrayList<String>();
		allListWindowRef.addAll(allSetWindowRef);
//		System.out.println(allListWindowRef.size());
		driver.switchTo().window(allListWindowRef.get(1));
//		enter first name
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Kums");
//		click find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		to avoid stale element exception using Thread.sleep method
		Thread.sleep(3000);
//		fetch first displayed id
		String secondLeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]").getText();
//		System.out.println("Second lead id: "+secondLeadID);
//		click Second displayed lead id
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
//		get all the opened window references
		allSetWindowRef = driver.getWindowHandles();
//		copy set value to list
		allListWindowRef = new ArrayList<String>();
		allListWindowRef.addAll(allSetWindowRef);
//		System.out.println(allListWindowRef.size());
		driver.switchTo().window(allListWindowRef.get(0));
//		verify the first displayed id entered in the text box after fetching
		String verifySecondName = driver.findElementByXPath("//input[@id='ComboBox_partyIdTo']").getAttribute("value");
		if(verifySecondName.equals(secondLeadID))
		{
			System.out.println("Second lead id is entered correctly in the To lead text box: "+verifySecondName);
		}
		else
		{
			System.out.println("Second lead id is not entered correctly in the To lead text box: "+verifySecondName);
		}
//		click Merge button
		driver.findElementByXPath("//a[text()='Merge']").click();
//		switch to pop up
		driver.switchTo().alert().accept();
//		click Find Lead button
		driver.findElementByXPath("//a[text()='Find Leads']").click();
//		Enter Lead id
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstLeadID);
//		click Find Lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Verifying the text "No records to display"
		String noRecordsMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
//		System.out.println("Final message after merging: "+noRecordsMessage);
		if(noRecordsMessage.equals("No records to display"))
		{
			System.out.println("Merge is happened correctly: "+noRecordsMessage);
		}
		else
		{
			System.out.println("Merge is not happened correctly: "+noRecordsMessage);
		}
//		take screenshot
		File srcLoc = driver.getScreenshotAs(OutputType.FILE);
		File destinationLoc = new File("./snaps/NoRecordsToDisplayMessage.png");
		FileUtils.copyFile(srcLoc, destinationLoc);
//		close browser
		driver.close();
	}

}