package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectTopPage {
	@FindBy(xpath="(//img[@class='img-responsive'])[1]") private WebElement select;
	
	public SelectTopPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void selecttop()
	{
		select.click();
	}
}
