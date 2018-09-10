package testcases;

import com.aventstack.extentreports.ExtentReports;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class Report {
	public ExtentTest test,testData;
	public ExtentReports extent;
@BeforeSuite
public void startResult()
{
	ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
	html.setAppendExisting(true);
	extent=new ExtentReports();
	extent.attachReporter(html);
}

public String reportStep(String desc,String status)
{
	if(status.equalsIgnoreCase("pass"))
	System.out.println("Pass");
else
	System.out.println("Fail");
	return null;
}

//@BeforeClass
public void startTestcase(String testNmae,String desc)
{
	test=extent.createTest(testNmae,desc);
}
//@BeforeMethod
public void beforeMethod(String author,String category)
{
	testData=test.createNode("leads");
	test.assignAuthor(author);
	test.assignCategory(category);
}
//@AfterSuite
public void endResult()
{
	extent.flush();
}
}


