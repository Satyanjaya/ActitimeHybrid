package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;
import util.FetchingDataExcelPropertie;
import util.Helper;

public class TypesOfwork extends FetchingDataExcelPropertie
{
	
	@FindBy(xpath = "//li[@class='popup_menu_item']")
	private List<WebElement>clickTypesOfWork;
	
	@FindBy(xpath = "(//div[contains(.,'New Type')])[3]")
	private WebElement clickNewType;
	
	@FindBy(xpath = "//input[@placeholder='Enter name']")
	private WebElement EnterTypesWorkName;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement workNameSave;
	
	@FindBy(xpath = "//span[.='RadhaRamana']/../../../../..//span[contains(@class,'components-ItemListPage-ItemList-checkbox')]")
	private WebElement click;
	
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement clickDelete;
	
	@FindBy(xpath = "//button[text()='OK, Delete']")
	private WebElement okDelete;
	
	public TypesOfwork(WebDriver driver)
	{
		Base.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickTypesOfWork() throws Throwable
	{
		System.out.println(clickTypesOfWork.size());
		for(WebElement newclickTypesOfWork:clickTypesOfWork)
		{
			Thread.sleep(4000);
			System.out.println(newclickTypesOfWork.getText());
			if(newclickTypesOfWork.getText().equals("Types of Work"))
			{
				Helper.heighlightElements(driver, newclickTypesOfWork);
				newclickTypesOfWork.click();
				break;
			}
		}
	}
	
   public void clickNewType() throws Throwable
   {
	   Helper.heighlightElements(driver, clickNewType);
	   clickNewType.click();
   }
   public void WorkName() throws Throwable
   {
	   Helper.heighlightElements(driver, EnterTypesWorkName);
	   EnterTypesWorkName.sendKeys("RadhaRamana");
   }
   public void workNameSave() throws Throwable
   {
	   Helper.heighlightElements(driver, workNameSave);
	   workNameSave.click();
   }
//   public void click()
//   {
//	   click.click();
//   }
//   public void clickDelete()
//   {
//	   clickDelete.click();
//   }
//   public void okDelete()
//   {
//	   okDelete.click();
//	   System.out.println("new Types work is deleted");
//   }
   
}
