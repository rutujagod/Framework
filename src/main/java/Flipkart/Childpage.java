package Flipkart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Childpage {
	@FindBy(xpath="(//div[@class='_25b18c']/descendant::div[1])[1]") private WebElement price;
	
	public Childpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void printprice() {
		price.getText();
	}
}
