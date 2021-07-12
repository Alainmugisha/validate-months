package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base_page {

	
	public void selectdropdown (WebElement element, String value) {
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
		select.getOptions();
		
	}
	public void selectdropdownoptions (WebElement element, String value) {
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
}
