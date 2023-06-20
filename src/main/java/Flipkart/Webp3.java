package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webp3 {
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (Black, 64 GB)']") private WebElement clickonmb;
	
	public Webp3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void click1()
	{
		clickonmb.click();
	}

}
