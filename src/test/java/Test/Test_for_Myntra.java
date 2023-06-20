package Test;

import java.util.ArrayList;

import java.util.Set;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_for_Myntra;
import Myntra.ChildBrowserPage;
import Myntra.SearchPage;
import Myntra.SelectTopPage;
import Utility.Utility_for_Myntra;


public class Test_for_Myntra extends Base_for_Myntra {
	SearchPage s1;
	SelectTopPage s2;
	ChildBrowserPage c1;
	
	@BeforeClass
	public void openbrow()
	{
		openbrowser();
		s1=new SearchPage(driver);
		s2=new SelectTopPage(driver);
		c1=new ChildBrowserPage(driver);
		
	}
	@BeforeMethod
	public void openapp()
	{
		Reporter.log("openapp");
	}
	
	@Test
	public void TC1() throws Throwable
	{
		s1.searchbox(Utility_for_Myntra.getdata(0, 0));
		s2.selecttop();
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allwindows);
		String chilwindow=al.get(1);
		driver.switchTo().window(chilwindow);
		c1.selectsize();
		c1.addtocart();	
		c1.getoff();
		c1.getbag();
		c1.getcancel();
		//c1.getpopup();
		
		
		
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout");
	}
    @AfterClass
    public void closebrowser()
    {
	Reporter.log("close");
    }
}
