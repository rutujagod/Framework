package BlazeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PurchaseticketPage {
	@FindBy(xpath="(//select[@class='form-inline'])[1]") private WebElement depar;
	@FindBy(xpath="(//select[@class='form-inline'])[2]") private WebElement destni;
	@FindBy(xpath="//input[@class='btn btn-primary']") private WebElement flights;
	
	public PurchaseticketPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void city1(String c1)
	{
		Select s=new Select(depar);
		s.selectByVisibleText(c1);
	}
	public void city2(String c2)
	{
		Select s=new Select(destni);
		s.selectByVisibleText(c2);
	}
public void findflights()
{
	flights.click();
}
}
