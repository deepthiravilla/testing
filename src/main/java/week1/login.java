package week1;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	
	public static void main(String[] args) throws IOException {
		
		//launching browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\chromedriver.exe");
		//load URL
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByPartialLinkText("Create").click();
//		driver.findElementById("createLeadForm_companyName").sendKeys("FORD");
//		driver.findElementById("createLeadForm_parentPartyId").sendKeys("10423");
//		driver.findElementById("createLeadForm_firstName").sendKeys("Kumaran");
//		driver.findElementById("createLeadForm_lastName").sendKeys("S");ww
		Select dataSourceDropDown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
//		dataSourceDropDown.selectByValue("LEAD_EMPLOYEE"); 
		dataSourceDropDown.selectByVisibleText("Employee");

		Select mcDropDown = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		mcDropDown.selectByValue("DEMO_MKTG_CAMP"); 
//		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Deepthi");
//		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Rajesh");
//		driver.findElementById("createLeadForm_personalTitle").sendKeys("Salutation");
//		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs.");
//		driver.findElementById("createLeadForm_departmentName").sendKeys("SeleniumDept");
//		driver.findElementById("createLeadForm_departmentName").sendKeys("SeleniumDept");
//		driver.findElementById("createLeadForm_annualRevenue").sendKeys("8970.890");
//		driver.findElementById("createLeadForm_numberEmployees").sendKeys("145900");
//		driver.findElementById("createLeadForm_sicCode").sendKeys("SicCode");
//		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("TcikerSymbol");
		Select pcDropDown = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		pcDropDown.selectByValue("DZD"); 
		Select industryDropDown = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industryDropDown.selectByIndex(5); 
		Select ownerShipDropDown = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		List<WebElement> allOptions = ownerShipDropDown.getOptions();
		int count = allOptions.size();
		ownerShipDropDown.selectByIndex(count-1);
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++)
		{
			System.out.println(allOptions.get(i).getText());
		}
		for(WebElement eachObj: allOptions)
		{
			System.out.println(eachObj.getText());
		}
		
//		ownerShipDropDown.selectByValue("OWN_LLC_LLP"); 
//		driver.findElementById("createLeadForm_description").sendKeys("Creating Description for the create lead");
//		driver.findElementById("createLeadForm_importantNote").sendKeys("Creating important note for the create lead");
//		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
//		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1529");
//		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("605013");
//		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("3331");
//		driver.findElementById("createLeadForm_primaryEmail").sendKeys("deepthiravilla508@gmail.com");
//		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8904510102");
//		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("SK create leads");
//		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("TestLeafURL");
//		driver.findElementById("createLeadForm_generalToName").sendKeys("ToName");
//		driver.findElementById("createLeadForm_generalAttnName").sendKeys("AttentionName");
//		driver.findElementById("createLeadForm_generalAddress1").sendKeys("4-13");
//		driver.findElementById("createLeadForm_generalAddress2").sendKeys("kammastreet");
//		driver.findElementById("createLeadForm_generalCity").sendKeys("yerpedu");
//		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("517619");
//		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("08578");
//		Select stateDropDown = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
//		stateDropDown.selectByValue("AZ"); 
//		Select countryDropDown = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
//		countryDropDown.selectByValue("ASM"); 
//		driver.findElementByName("submitButton").click();
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/image1.png");
		FileUtils.copyFile(screenshotAs, destination);
//		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
//		System.out.println(firstName);
//		if(firstName.equals("Deepthi"))
//		{
//			System.out.println("First Name Matched: "+firstName);
//		}
//		else
//		{
//		System.out.println("First Name not Matched: "+firstName);
//		}
//		
//		driver.close();


	}

}

