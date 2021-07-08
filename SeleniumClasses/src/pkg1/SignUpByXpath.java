package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpByXpath 
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
	driver.findElementByCssSelector("a[data-testid='open-registration-form-button']").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//input[@name='firstname']").sendKeys("Automation");
	driver.findElementByXPath("//input[@name='lastname']").sendKeys("Testing");
	driver.findElementByXPath("//input[@name='reg_email__']").sendKeys("testautomation123@gmail.com");
	driver.findElementByXPath("//input[@name='reg_email_confirmation__']").sendKeys("testautomation123@gmail.com");
	driver.findElementByXPath("//input[@id='password_step_input']").sendKeys("Testautomation@123");
	Thread.sleep(2000); // to sleep/wait/pause for some second
	
	WebElement day=driver.findElementByXPath("//select[@id='day']");
	dropdownhandling("2",day);
	WebElement month=driver.findElementByXPath("//select[@name='birthday_month']");
	dropdownhandling2("7", month);
	WebElement year=driver.findElementByXPath("//select[@id='year']");
	dropdownhandling(27, year);
	
	WebElement female=driver.findElementByXPath("//input[@value='1']");
	female.click();
	WebElement signup2=driver.findElementByXPath("//button[@name='websubmit']");
	signup2.click();
}
@Ignore
@After  
public void browserClose() throws InterruptedException
{
	Thread.sleep(2000);
//	driver.close();
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
