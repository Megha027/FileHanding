package pkg1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SignUpByJunit 
{
ChromeDriver driver;

@BeforeClass
public void browserOpen()
{	System.setProperty("webdriver.chrome.driver", "../SeleniumClasses/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
}

@org.testng.annotations.Test
public void insertInfo() throws InterruptedException
{
	driver.findElementByCssSelector("a[data-testid='open-registration-form-button']").click();
	Thread.sleep(2000);
	
	driver.findElementByName("firstname").sendKeys("Automation");
	driver.findElementByName("lastname").sendKeys("Testing");
	driver.findElementByName("reg_email__").sendKeys("testautomation123@gmail.com");
	driver.findElementByName("reg_email_confirmation__").sendKeys("testautomation123@gmail.com");
	driver.findElementById("password_step_input").sendKeys("Testautomation@123");
	Thread.sleep(2000); // to sleep/wait/pause for some second
	
	WebElement day=driver.findElementById("day");
	dropdownhandling("2",day);
	WebElement month=driver.findElementById("month");
	dropdownhandling2("7", month);
	WebElement year=driver.findElementByName("birthday_year");
	dropdownhandling(26, year);
	
	WebElement female=driver.findElementByCssSelector("input[value='1']");
	female.click();
	WebElement signup=driver.findElementByName("websubmit");
	signup.click();
}

@AfterClass  
public void browserClose() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}

public void dropdownhandling(String visibleText, WebElement element) 
{
	Select s=new Select(element);
	s.selectByVisibleText(visibleText);
}

public void dropdownhandling(int indexNum, WebElement element)
{
	Select s=new Select(element);
	s.selectByIndex(indexNum);
}

public void dropdownhandling2(String value1, WebElement element)
{
	Select s=new Select(element);
	s.selectByValue(value1);
}
}
