package istenersSIM;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Project.SIM.basepage;

public class Listeners extends basepage implements ITestListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		
		/*String methodName=result.getName().toString().trim();
		takeScreenShot(methodName);
		public void takeScreenShot(String methodName) {
		*/
		if(result.isSuccess()) {
			File imageFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			String successImageFileName=result.getMethod().getMethodName()+new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss").format(new GregorianCalendar().getTime())+".png";
			File successImageFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\screenshots"+successImageFileName);
			
				
					FileUtils.copyFile(imageFile, successImageFile);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			} 
			
			System.out.println("The name of the testcase passed is :"+result.getName());
	}
		
		 
		
		
	}

	
		
		
	


