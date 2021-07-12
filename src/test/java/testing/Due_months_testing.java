package testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserconfig.Browserrunner;
import pages.Months;


public class Due_months_testing  {

	WebDriver driver;
	Months mo;
	
	@Test
	@Parameters({"month1","month2","month3","month4","month5","month6","month7","month8","month9","month10","month11","month12"})
	public void due_months_testing (String months1,String months2,String months3,String months4,String months5,
			String months6,String months7,String months8,String months9,String months10,String months11,String months12) throws Throwable {
		
	driver = Browserrunner.openBrowser();	
		
			 mo = PageFactory.initElements(driver, Months.class);
			 
			 mo.due_mo_field(months3);
	
		
	driver = Browserrunner.closeBrowser();
	}
	

}
