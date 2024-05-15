package TestNG_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.BaseTest;
import util.BaseTestForCrossBrowser;


@Listeners(util.SingleScreenShot.class)
public class ActitimeLoginAndLogout extends BaseTest
{
    @Test
	public  void actitimeLoginOut() throws Throwable
    {
    	
    	System.out.println("Login is done");
    	
		}
    }
