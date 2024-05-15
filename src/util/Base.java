package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pom.ActitimeLogin;
import Pom.ActitimeLogout;
import Pom.ActitimeSetting;
import Pom.CreatCustomer;
import Pom.CreateLeaveType;
import Pom.DeleteLeaveType;
import Pom.DeleteTypeOfWork;
import Pom.TypesOfwork;

public class Base
{
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static 	ActitimeLogin login;
	public static ActitimeSetting clickSetting;
	public static TypesOfwork types;
	public static DeleteTypeOfWork delete;
	public static CreateLeaveType clickLeaveType;
	public static DeleteLeaveType deleteLeaveType;
	public static ActitimeLogout logout;
	public static CreatCustomer creatCustomer;
	public static FetchingDataExcelPropertie data;
	
	
	public static void obj()
	{
  
			 login=new ActitimeLogin(driver);
			 creatCustomer=new CreatCustomer(driver);
			 clickLeaveType=new CreateLeaveType(driver);
			 clickSetting=new ActitimeSetting(driver);
			 deleteLeaveType=new DeleteLeaveType(driver);
			 logout=new ActitimeLogout(driver);
			 data= new FetchingDataExcelPropertie(); 
			 
			

}
}
