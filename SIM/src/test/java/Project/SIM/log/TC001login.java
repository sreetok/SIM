package Project.SIM.log;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Project.SIM.basepage;
import pageUI.Login;

public class TC001login extends basepage
{
	Login details;
	

  @BeforeMethod
  @Parameters("browser")
  public void Start(String browser) throws Exception
  {
	  browserLaunch(browser,getData("SIMurl")); 
  }
  @Test
  public void log() 
  {
	details = new Login(driver);
	details.login1();
	  
  }
  

    @AfterMethod
  public void after() 
  {
	  
  }

}
