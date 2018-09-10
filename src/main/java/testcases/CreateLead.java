package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class CreateLead extends ProjectMethods{
	
	@BeforeClass(groups="common")
	public void setData() {
		sheetName ="login";
	}
	@Test(dataProvider="fetchData", groups= {"sanity"}/* dependsOnGroups="smoke"*/)
	public void createLead(String cname, String fname, String lname) {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));			
	}
	
}
//changes made by deepthi

/*data[0][0] ="TestLeaf";
		data[0][1] ="Gopinath";
		data[0][2] ="Jayakumar";
		
		data[1][0] ="TestLeaf";
		data[1][1] ="Gayatri";
		data[1][2] ="Krishna";*/




