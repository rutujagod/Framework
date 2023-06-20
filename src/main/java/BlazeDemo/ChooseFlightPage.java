package BlazeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseFlightPage {
	@FindBy(xpath="(//input[@class='btn btn-small'])[4]") private WebElement flights;
	
	public ChooseFlightPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void chooseflights()
	{
		flights.click();
	}
}
