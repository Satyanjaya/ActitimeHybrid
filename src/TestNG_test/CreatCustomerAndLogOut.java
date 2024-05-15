package TestNG_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.BaseTest;


@Listeners(util.SingleScreenShot.class)
public class CreatCustomerAndLogOut extends BaseTest
{
      @Test
	public void creatCustomerAndLogOut() throws Throwable
      {
    	 
		
		login.login();
	    creatCustomer.ClickOnTasks();
	    creatCustomer.AddNewCustomer();
	    creatCustomer.clickNewCustomer();
	    creatCustomer.CustomerName();
	    creatCustomer.ClickCreatCustomer();
		logout.logout();

	}

}
