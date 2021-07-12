package pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class Months extends Base_page {
	WebDriver driver;
	
	public Months(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how =How.XPATH, using ="//select[@name='due_month']")WebElement DUE_MONTHS_FIELD;
		
	
	
	public void due_mo_field(String  months)  throws Throwable  {
		
		selectdropdown(DUE_MONTHS_FIELD , months);

		Thread.sleep(2000);
	}
	
	
	
	
	public void takescreenshhot() throws Throwable {
		Thread.sleep(3000);

		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));
	}
}
