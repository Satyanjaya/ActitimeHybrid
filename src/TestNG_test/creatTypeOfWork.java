package TestNG_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pom.ActitimeLogout;
import Pom.TypesOfwork;
import util.BaseTest;
import util.BaseTestForCrossBrowser;



@Listeners(util.SingleScreenShot.class)
public class creatTypeOfWork extends BaseTestForCrossBrowser
{
    @Test
	public  void CreatTypeOfWork() throws Throwable
    {
    	
		clickSetting.clickSetting();
		 types=new TypesOfwork(driver);
		 types.clickTypesOfWork();
		 types.clickNewType();
		 types.WorkName();
		 types.workNameSave();
//		 types.click();
//		 types.clickDelete();
//		 types.okDelete();
		       
//		
//		logout.logout();

	}

}
