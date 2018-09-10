package wdMethodsAndTestcases.testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethodsAndTestcases.wdMethods.SeMethods;

import org.testng.annotations.Test;

public class TC001_Login extends SeMethods{
@Parameters({"url","username","password"})
@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleText=locateElement("class","crmsfa");
		click(eleText);
		WebElement eleCreate=locateElement("linkText","Create Lead");
		click(eleCreate);
		
		WebElement eleCompanyName = locateElement("id","createLeadForm_companyName");
		type(eleCompanyName, "TestLeaf");
		
		WebElement eleFirstName= locateElement("id","createLeadForm_firstName");
		type(eleFirstName,"Deepthi");
		WebElement eleLastName= locateElement("id","createLeadForm_lastName");
		type(eleLastName,"R");
		WebElement eleSubmit=locateElement("class","smallSubmit");
		click(eleSubmit);
		WebElement eleEdit=locateElement("xpath","//a[text()='Edit']");
		click(eleEdit);
		WebElement eleUpdate = locateElement("id","updateLeadForm_generalProfTitle");
		type(eleUpdate, "LeadUpdate");
		WebElement eleUpdated=locateElement("class","smallSubmit");
		click(eleUpdated);
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
	System.out.println(firstName);
		if(firstName.equals("Deepthi"))
		{
			System.out.println("First Name Matched: "+firstName);
		}
		else
{
		System.out.println("First Name not Matched: "+firstName);
		}
	
		
		
		
		}

}








