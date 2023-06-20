package Base;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_for_Myntra {
	public WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\care system\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(co);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

}
