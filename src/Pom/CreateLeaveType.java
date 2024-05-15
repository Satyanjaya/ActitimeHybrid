package Pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;
import util.FetchingDataExcelPropertie;
import util.Helper;

public class CreateLeaveType extends FetchingDataExcelPropertie
{
	
	
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement clickSetting;
	
	@FindBy(xpath = "//li[@class='popup_menu_item']")
	private List<WebElement>clickleaveType;
	
	@FindBy(xpath = "//div[text()='New Type']")
	private WebElement click;
	
	@FindBy(xpath = "//input[@placeholder='Enter name']")
	private WebElement EnterName;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	private WebElement save;
	
	public CreateLeaveType (WebDriver driver)
	{
		Base.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSetting() throws Throwable
	{
		Helper.heighlightElements(driver, clickSetting);
		clickSetting.click();
	}
	
	
	public void clickLeaveType() throws Throwable
	{
		System.out.println(clickleaveType.size());
		for(WebElement newclickleaveType:clickleaveType)
		{
			Thread.sleep(4000);
			System.out.println(newclickleaveType.getText());
			if(newclickleaveType.getText().equals("Leave Types"))
			{
				Helper.heighlightElements(driver, newclickleaveType);
				newclickleaveType.click();
				break;
			}
		}
	}
	public void NewType() throws Throwable
	{
		Helper.heighlightElements(driver, click);
		click.click();
	}
	public void LeaveEnterName() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Helper.heighlightElements(driver, EnterName);
		EnterName.sendKeys("RadhaBalabha1");
		Helper.heighlightElements(driver, save);
		save.click();
	}

}
