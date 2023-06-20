package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildBrowserPage {
	
	@FindBy(xpath="(//p[@class='size-buttons-unified-size'])[1]") private WebElement size;
	@FindBy(xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']") private WebElement add;
	@FindBy(xpath="//span[contains(@class,'pdp-discount')]") private WebElement off;
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']") private WebElement bag;
	@FindBy(xpath="//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkRemove']") private WebElement cancel;
	@FindBy(xpath="//div[@class='itemComponents-base-selectionIconContainer itemContainer-base-selectionIndicator']") private WebElement pop;
	public ChildBrowserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectsize()
	{
		size.click();
	}
	public void addtocart()
	{
		add.click();
	}
	public void getoff()
	{
		String offer=off.getText();
		System.out.println(offer);
		
	}
	public void getbag()
	{
	  bag.click();	
	}
	public void getcancel()
	{
		cancel.click();
	}
	public void getpopup()
	{
		pop.click();
	}
}
