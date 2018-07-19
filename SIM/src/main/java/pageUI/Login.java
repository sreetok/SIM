package pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project.SIM.basepage;

public class Login extends basepage
{
	@FindBy(id="username") WebElement Username;
	@FindBy(id="password") WebElement Password;
	@FindBy(id="btnsubmit") WebElement login;
	

	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login1()
	{
		try {
			Username.clear();
			Password.clear();
			Username.sendKeys("admin");
			Password.sendKeys("master");
			login.click();
			
		}catch(Exception e) {
			
		}

		
		

	}

}
