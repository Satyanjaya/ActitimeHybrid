package TestNG_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.BaseTest;



@Listeners(util.SingleScreenShot.class)
public class DeleteAndLogOutLeave extends BaseTest
{
    @Test
	public void deleteAndLogOutLeave() throws Throwable
	{
    	
	
		 clickLeaveType.clickOnSetting();
		clickLeaveType.clickLeaveType();
		clickLeaveType.NewType();
		clickLeaveType.LeaveEnterName();
		deleteLeaveType.deleteLeave();
		logout.logout();
		

	}

}
