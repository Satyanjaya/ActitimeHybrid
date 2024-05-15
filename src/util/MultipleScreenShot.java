package util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MultipleScreenShot implements ITestListener
{
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		TakesScreenshot ts =(TakesScreenshot)BaseTest.driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		String name = result.getName();
		Date time = Calendar.getInstance().getTime();
		
		String today = time.toString().replace(":", "-");
		
		File dest = new File("./screenShot/"+name+today+".png");
		
		
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


}
