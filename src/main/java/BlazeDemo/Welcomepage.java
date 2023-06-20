package BlazeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	@FindBy(xpath="//h1[text()='Welcome to the Simple Travel Agency!']") private WebElement title;
	 
	public Welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
public void distitle()
{
	boolean Web1 = title.isDisplayed();
	System.out.println(Web1);
	
}

}
