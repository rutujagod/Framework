package Myntra;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(xpath="//input[@class='desktop-searchBar']") private WebElement search;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void searchbox(String data)
	{
		search.sendKeys(data,Keys.ENTER);
		
	}
}
