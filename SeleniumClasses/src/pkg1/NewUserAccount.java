package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

public class NewUserAccount 
{
public static void dropdownhandling(String visibletext,WebElement element)
{
	Select s=new Select(element);
	s.selectByVisibleText(visibletext);
}
public static void dropdownhandling(int indexnum,WebElement element)
{
	Select s=new Select(element);
	s.selectByIndex(indexnum);
}
public static void dropdownhandling1(String value,WebElement element)
{
	Select s=new Select(element);
	s.selectByValue(value);
}

public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "../SeleniumClasses/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement newaccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
	newaccount.click();
	Thread.sleep(1500);
	
	WebElement fname=driver.findElementByName("firstname");
	fname.sendKeys("Automation");
	WebElement lname=driver.findElementByName("lastname");
	lname.sendKeys("Testing");
	WebElement mobNo=driver.findElementByName("reg_email__");
	mobNo.sendKeys("7972433109");
	WebElement passowrd=driver.findElementByName("reg_passwd__");
	passowrd.sendKeys("abc@123#");
	
	WebElement day=driver.findElementByName("birthday_day");
	dropdownhandling("2",day);
	WebElement month=driver.findElementById("month");
	dropdownhandling(6, month);
	WebElement year=driver.findElementByName("birthday_year");
	dropdownhandling1("1995", year);
	
	WebElement female=driver.findElement(By.name("sex"));
	female.click();	
//	WebElement male=driver.findElement(By.cssSelector("input[value='2']")); selection of male radio button
//	male.click();
	
	WebElement signup=driver.findElementByName("websubmit");
	signup.click();
	
}
}
