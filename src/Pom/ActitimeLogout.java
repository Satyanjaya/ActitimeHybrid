package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;
import util.FetchingDataExcelPropertie;
import util.Helper;

public class ActitimeLogout extends FetchingDataExcelPropertie
{
	
	@FindBy (xpath = "(//a[@id='logoutLink'])[1]")
	private WebElement logout;
	
	public ActitimeLogout(WebDriver driver)
	{
		Base.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws Throwable
	{
		Helper.heighlightElements(driver, logout);
		logout.click();
	}

}
