package Flipkart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webp1 {
	@FindBy(xpath="//button[text()='✕']") private WebElement  cancelbtn;
	
	public Webp1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void btn()
	{
		cancelbtn.click();
	}

}
