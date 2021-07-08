package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByJunit 
{
	ChromeDriver driver;
	@Before
	public void browserOpen()
	{	System.setProperty("webdriver.chrome.driver", "../SeleniumClasses/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void insertInfo() throws InterruptedException
	{
		driver.findElementByName("email").sendKeys("Automation");
		driver.findElementById("pass").sendKeys("automation@1234");;
		driver.findElementByName("login").click();
		Thread.sleep(2000);
	}
	
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}


}
