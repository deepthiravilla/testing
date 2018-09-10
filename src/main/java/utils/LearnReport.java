package utils;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class LearnReport {
	public static void main(String[] args) throws IOException {
		
	ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
	html.setAppendExisting(true);
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(html);
	ExtentTest test = extent.createTest("TC001_Login", "Login to LeafTaps");
	test.assignAuthor("Gayatri");
	test.assignCategory("Smoke");
	test.pass("Username enter successfully",
	MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
	test.pass("crmsfa is enter successfully");
	test.warning("Login not clicked successfully");
	extent.flush();
	}
}



