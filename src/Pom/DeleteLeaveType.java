package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;
import util.FetchingDataExcelPropertie;
import util.Helper;

public class DeleteLeaveType extends FetchingDataExcelPropertie
{
	
	
	@FindBy(xpath = "//span[contains(.,'RadhaBalabha')]/../../../..//div[@data-for='itemListPageTooltip']")
	private WebElement click;
	
	public DeleteLeaveType(WebDriver driver)
	{
		Base.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void deleteLeave() throws Throwable
	{


		Thread.sleep(3000);
		Helper.heighlightElements(driver, click);
		js.executeScript("argumentas[0].click()", click);
	}

}
