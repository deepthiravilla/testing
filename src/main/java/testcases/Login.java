package testcases;


import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import wdMethodsAndTestcases.wdMethods.SeMethods;

public class Login extends SeMethods {

	@Test(groups="smoke")
	public void login() {
	startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement eleUname = locateElement("id", "username");
	type(eleUname, "DemoSalesManager");
	type(locateElement("id", "password"), "crmsfa");
	click(locateElement("class", "decorativeSubmit"));
	
	
	
	}
}



