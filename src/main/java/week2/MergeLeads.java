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


public class MergeLeads {

	
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String text=driver.findElementById("form").getText();	
		System.out.println(text);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Deepthi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String firstLeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").getText();
//		System.out.println("First lead id: "+firstLeadID);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByXPath("//span[text()='To Lead']//following::a/img[@src='/images/fieldlookup.gif']").click();
//		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("ravilla");
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
