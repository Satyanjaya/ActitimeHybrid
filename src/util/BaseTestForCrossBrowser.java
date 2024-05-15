package util;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTestForCrossBrowser extends Base implements AutoConstant
{
	@BeforeMethod
	public void start() throws Throwable
	{
		Base.obj();
		 login.login();
	}
	@AfterMethod
	public void end() throws Throwable
	{
		logout.logout();
	}
	@Parameters("browser")
	@BeforeClass()
	public void Classlevelstart(String browser) 
	{
		System.out.println("Execution Start In class level");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			driver.get(AppURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
					driver.get(AppURL);
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.get(AppURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		}
	}
	@AfterClass
	public void ClassLevelEnded()
	{
		System.out.println("Execution Ended In Class Level");
	}
	@BeforeTest
	public void TestLevelStarted()
	{
		System.out.println("Execution Start in Test Level");
	}
	@AfterTest
	public void TestLevelEnded()
	{
		System.out.println("Execution ended in Test Level");
	}
	
	
}
