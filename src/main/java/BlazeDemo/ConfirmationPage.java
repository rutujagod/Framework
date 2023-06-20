package BlazeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
@FindBy(xpath="//input[@class='btn btn-primary']") private WebElement confirm;

public ConfirmationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void confirmpage()
{
	confirm.click();
}
}
