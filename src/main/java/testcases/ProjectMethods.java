package testcases;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcases.ReadExcel;
import wdMethodsAndTestcases.wdMethods.SeMethods;



	public class ProjectMethods extends SeMethods {
		public  String sheetName,author,category,testName,desc;
@BeforeSuite
public void beforeSuite()
{
	startResult();
}
	
	@BeforeClass
	public void beforeClass()
	{
		startTestcase(testName,desc);
	}
	
	@Parameters({"url", "uname", "pwd"})
		@BeforeMethod(groups="common")
		public void login(String URL, String username, String password) {
			startApp("chrome", URL);
			WebElement eleUname = locateElement("id", "username");
			type(eleUname, username);
			type(locateElement("id", "password"), password);
			click(locateElement("class", "decorativeSubmit"));
			click(locateElement("linkText", "CRM/SFA"));
			}
		@AfterMethod(groups="common")
		public void close() {	
			closeAllBrowsers();
		}
		@DataProvider(name="fetchData")
		public String[][] excelData() throws IOException {
	    ReadExcel excel = new ReadExcel();
	    return excel.getData(sheetName);	
		}
	}


