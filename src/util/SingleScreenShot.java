package util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SingleScreenShot implements ITestListener
{


	@Override
	public void onTestFailure(ITestResult result)
	{
      TakesScreenshot ts =(TakesScreenshot)BaseTest.driver;
      File source = ts.getScreenshotAs(OutputType.FILE);
      File dest = new File("./ScreenShot/Failed.png");

    try {
		FileHandler.copy(source, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
	

