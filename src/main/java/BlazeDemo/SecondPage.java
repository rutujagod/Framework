package BlazeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
@FindBy(xpath="//a[text()='destination of the week! The Beach!']") private WebElement link;

public SecondPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void click()
{
	link.click();
}
}
