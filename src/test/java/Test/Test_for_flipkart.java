package Test;
import java.util.ArrayList;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_for_flipkart;
import Flipkart.Childpage;
import Flipkart.Webp1;
import Flipkart.Webp2;
import Flipkart.Webp3;
import Utility.Utility_for_flipkart;

public class Test_for_flipkart extends Base_for_flipkart {
	
	Webp1 w1;
	Webp2 w2;
	Webp3 w3;
	Childpage ch;
	@BeforeClass
	public void openbrow()
	{
		open_browser();
		w1=new Webp1(driver);
		w2=new Webp2(driver);
		w3=new Webp3(driver);
		ch=new Childpage(driver);
		
	}
	@BeforeMethod
	public void openapp() throws Exception, Throwable
	{
		Reporter.log("running TC1",true);
		w1.btn();
		w2.entersearchbox(Utility_for_flipkart.getData(0, 0));
    	w3.click1();
	}
    @Test
    public void actual() throws Exception, Throwable {
    	Reporter.log("correct");
    	
    	Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allwindows);
		String mainwin=al.get(1);
		System.out.println(mainwin);
		
    	ch.printprice();
    }
    @AfterMethod
    public void closeapp()
    {
    	Reporter.log("closed");
    }
    @AfterClass
    public void closebrow()
    {
    	Reporter.log("closed browser");
    }
}
