package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;
import util.FetchingDataExcelPropertie;
import util.Helper;

public class ActitimeSetting extends FetchingDataExcelPropertie
{
	
	
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement clickSetting;
	
	public ActitimeSetting (WebDriver driver)
	{
		Base.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSetting() throws Throwable
	{
		Helper.heighlightElements(driver, clickSetting);
		clickSetting.click();
	}

}
