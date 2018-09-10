package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Edit extends ProjectMethods{
	
	@BeforeClass(groups="common")
	public void setData() {
		sheetName ="login";
	}
	@Test(dataProvider="fetchData", groups= {"sanity"}/* dependsOnGroups="smoke"*/)
	public void Edit()
	{
		
	}
	
	}