package util;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends Base implements AutoConstant
{
  @BeforeMethod
  public void start() throws Throwable
  {
	  driver= new ChromeDriver();
	  
	  driver.get(AppURL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	  Base.obj();
	  login.login();
	  }
  @AfterMethod
  public void logout() throws Throwable
  {
	  logout.logout();
  }
  @BeforeSuite
  public void suitlevelstart()
  {
	  System.out.println("execution Start in Suite Level");
  }
  @AfterSuite
  public void suitlevelended()
  {
	  System.out.println("execution ended in Suite Level");
  }
  @BeforeClass
  public void classlevelstart()
  {
	  System.out.println("execution Start in Class Level");
  }
  @AfterTest
  public void classlevelendet()
  {
	  System.out.println("execution ended in Class Level");
  }
}





