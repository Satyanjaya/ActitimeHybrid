package TestNG_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.BaseTest;


@Listeners(util.SingleScreenShot.class)
public class CreateLeaveAndLogOut extends BaseTest
{
    @Test
	public void createLeaveAndLogOut() throws Throwable
    {
    	
		
		 clickLeaveType.clickOnSetting();
		clickLeaveType.clickLeaveType();
		clickLeaveType.NewType();
		clickLeaveType.LeaveEnterName();
		logout.logout();
		
		 

	}

}
