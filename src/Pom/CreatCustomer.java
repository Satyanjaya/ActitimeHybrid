package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;
import util.FetchingDataExcelPropertie;
import util.Helper;

public class CreatCustomer extends FetchingDataExcelPropertie
{
	
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement clickOnTasks;
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement AddNewCustomer;
	
	@FindBy(xpath = "(//div[contains(.,'+ New Customer')])[2]")
	private WebElement clickNewCustomer;
	
	@FindBy(xpath = "(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement customerName;
	@FindBy(xpath = "//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement EnterDesc;
	
	@FindBy(xpath = "(//div[contains(.,'- Select Customer -')])[8]")
	private WebElement selectCustomer;
	
	@FindBy(xpath = "(//div[contains(.,'Create Customer')])[5]")
	private WebElement CreatCustomer;
	
	
	public CreatCustomer(WebDriver driver)
	{
		
		Base.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnTasks() throws Throwable
	{ 
		Helper.heighlightElements(driver, clickOnTasks);
		clickOnTasks.click();
	}
	public void AddNewCustomer() throws Throwable
	{
		Helper.heighlightElements(driver, AddNewCustomer);
		AddNewCustomer.click();
	}
	public void clickNewCustomer() throws Throwable
	{
		Helper.heighlightElements(driver, clickNewCustomer);
		clickNewCustomer.click();
	}
	public void CustomerName() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Helper.heighlightElements(driver, customerName);
		customerName.sendKeys("Jay Radhakanta");
		Helper.heighlightElements(driver, EnterDesc);
		EnterDesc.sendKeys("Radha...........");
	}
//	public void selectCustomer()
//	{
//		Select sel=new Select(selectCustomer);
//		sel.selectByVisibleText("Big Bang Company");
//	}
	public void ClickCreatCustomer() throws Throwable
	{
		Helper.heighlightElements(driver, CreatCustomer);
		CreatCustomer.click();
	}
	

}
