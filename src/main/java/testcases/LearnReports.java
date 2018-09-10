package testcases;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.IOException;

public class LearnReports {

	public static void main(String[] args){
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test=extent.createTest("TC001_Login","Login to leaftap");
		test.pass("Username entered successfully");
		test.pass("password entered successfully");
		test.pass("Login clicked successfully");
		extent.flush();

	}

}


