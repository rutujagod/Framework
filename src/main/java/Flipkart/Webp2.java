package Flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webp2 {
@FindBy(xpath="//input[@class='_3704LK']") private WebElement search;

public Webp2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void entersearchbox(String data)
{
	search.sendKeys(data,Keys.ENTER);
}
}
