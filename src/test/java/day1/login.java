package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//inside a class will use instant variable or local variable
		//launch browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
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
	
		//load url
		//enter user name
		//enter password
		//click login button
		//click logout butto

	}

}
