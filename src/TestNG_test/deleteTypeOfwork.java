package TestNG_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pom.TypesOfwork;
import util.BaseTest;
import util.BaseTestForCrossBrowser;



@Listeners(util.SingleScreenShot.class)
public class deleteTypeOfwork extends BaseTest
{
    @Test
	public  void DeleteTypeOfwork() throws Throwable
    {
    	
		
			clickSetting.clickSetting();
			
			 types=new TypesOfwork(driver);
			 types.clickTypesOfWork();
			 types.clickNewType();
			 types.WorkName();
			 types.workNameSave();
			 
			  delete.click();
			  delete.clickDelete();
			  delete.okDelete();
		
	}

}
