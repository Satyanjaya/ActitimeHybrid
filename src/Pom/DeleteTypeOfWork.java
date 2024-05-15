package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;
import util.FetchingDataExcelPropertie;
import util.Helper;

public class DeleteTypeOfWork extends FetchingDataExcelPropertie
{
	
	@FindBy(xpath = "//span[.='RadhaRamana']/../../../../..//span[contains(@class,'components-ItemListPage-ItemList-checkbox')]")
	private WebElement click;
	
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement clickDelete;
	
	@FindBy(xpath = "//button[text()='OK, Delete']")
	private WebElement okDelete;
	
	public DeleteTypeOfWork(WebDriver driver)
	{
		Base.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
  public void click() throws Throwable
  {
	  Helper.heighlightElements(driver, click);
	   click.click();
  }
  public void clickDelete() throws Throwable
  {
	  Helper.heighlightElements(driver,clickDelete);
	   clickDelete.click();
  }
  public void okDelete() throws Throwable
  {
	  Helper.heighlightElements(driver, okDelete);
	   okDelete.click();
	   System.out.println("new Types work is deleted");
  }

}
