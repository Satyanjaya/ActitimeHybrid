package util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage 
{
	public void ActionClick(WebDriver driver, WebElement element)
	{
		
		Actions action = new Actions(driver);
	   action.click(element).perform();
		
	}
	public void ActionsClickandHold(WebDriver driver,  WebElement element)
	{
		Actions action = new Actions(driver);
		action.clickAndHold(element).perform();
    }
	public void ActionMoveToElement(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	//AlertInterFace
	public void AlertOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void AlertCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}

	
	

}
