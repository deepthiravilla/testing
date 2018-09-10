package day1;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	//inside a class will use instant variable or local variable
		//launch browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String text=driver.findElementById("form").getText();	
		System.out.println(text);
//		
	if(text.contains("welcome"))
	{
		System.out.println("text is matched");
	}else
	{
		System.out.println("text is not matched");
	}
	
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("TEST LEAF");
	driver.findElementById("createLeadForm_firstName").sendKeys("Deepthi");
	driver.findElementById("createLeadForm_lastName").sendKeys("Ravilla");
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("learning selenium");
	WebElement src=driver.findElementById("createLeadForm_dataSourceId");
	Select sel=new Select(src);
	File src1 = driver.getScreenshotAs(OutputType.FILE);
	File dec = new File("./snaps/img1.png");
	FileUtils.copyFile(src1,dec);
	
	WebElement src2=driver.findElementById("createLeadForm_dataSourceId");
	Select sel2=new Select(src2);
	//sel2.selectByVisibleText("Direct Mail");
	//sel2.selectByValue("7");
	
	WebElement src3=driver.findElementById("createLeadForm_dataSourceId");
	Select sel3= new Select(src3);
	List<WebElement>allOptions=sel.getOptions();
	int count=allOptions.size(); 
	for(int i=0;i<args.length;i++)
	{
	System.out.println(allOptions.get(i).getText());
	}
	for(WebElement eachOption:allOptions)
	{
		System.out.println(eachOption.getText());
	}
	
	
	
	
	
	}}
	