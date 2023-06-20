package Test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_for_BlazeDemo;
import BlazeDemo.ChooseFlightPage;
import BlazeDemo.ConfirmationPage;
import BlazeDemo.PurchaseticketPage;
import BlazeDemo.SecondPage;
import BlazeDemo.Welcomepage;
import Utility.Utility_for_BlazeDemo;

public class Test_for_BlazeDemo extends Base_for_BlazeDemo{
	Welcomepage w1;
	SecondPage s1;
	PurchaseticketPage p1;
	ChooseFlightPage c1;
	ConfirmationPage c2;
	@BeforeClass
	public void openbrowser()
	{
		 openbrow();
		w1=new Welcomepage(driver);
		s1=new SecondPage(driver);
		p1=new PurchaseticketPage(driver);
		c1=new ChooseFlightPage(driver);
		c2=new ConfirmationPage(driver);
	}
	
	@BeforeMethod
	public void opneapp()
	{
		w1.distitle();
		Reporter.log("app open",true);
	}

	@Test
	public void actualTC() throws Exception
	{
		
		s1.click();
		driver.navigate().back();
		p1.city1(Utility_for_BlazeDemo.getdata(0, 0));
		p1.city2(Utility_for_BlazeDemo.getdata(0, 1));
		p1.findflights();
		c1.chooseflights();
		c2.confirmpage();
		
		
		
		
}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout");
		driver.close();
	}
	
	
	
	@AfterClass
	public void closebrow()
	{
		Reporter.log("close app");
	}
}
