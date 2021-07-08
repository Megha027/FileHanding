package pkg1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class YoutubeLoginTestNG1 
{
WebDriver driver;

public void browseropen()
{    //System.setProperty("webdriver.ie.driver", "../SeleniumClasses/Drivers/IEDriverServer.exe");
	      
 //driver=new InternetExplorerDriver();  
	System.setProperty("webdriver.chrome.driver", "../SeleniumClasses/chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "../SeleniumClasses/Drivers/geckodriver.exe");
	driver=new ChromeDriver();
	//driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
}
public static void main(String[] args) throws InterruptedException {
	YoutubeLoginTestNG1 obj=new YoutubeLoginTestNG1();
	obj.browseropen();
	obj.trendingClick();
}

public void trendingClick() throws InterruptedException
{
	//WebElement signin=(WebElement) driver.findElementsByXPath("//a[@*='https://accounts.google.com/ServiceLogin/signinchooser?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&hl=en&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin']");
	//WebElement signin=(WebElement) driver.findElementsByXPath("//a[@href='https://accounts.google.com/ServiceLogin/signinchooser?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&hl=en&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin']");
	//WebElement signin=(WebElement) driver.findElementsByXPath("//*[@role='button']");
	//WebElement signin=(WebElement) driver.findElementsByXPath("//*[@aria-label='Sign in']");
	//WebElement signin=(WebElement) driver.findElementsByXPath("//*[@name='passive_signin']");
	//WebElement signin=(WebElement) driver.findElementsByXPath("//yt-formatted-string[text(),'Sign in']");
	
	//*[@class='style-scope tp-yt-paper-button']
	
	//WebElement signin=driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign in')]"));
	//WebElement signin= driver.findElementsByXPath("//*[@class='style-scope tp-yt-paper-button']");

	//signin.click();
	//Thread.sleep(2000);
//driver.findElement(By.name("identifier")).sendKeys("meghabaghele02@gmail.com");
//click on next button
//WebElement nextBtn=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
//nextBtn.click();
	//driver.findElementByName("identifier").sendKeys("meghabaghele02@gmail.com");
	
	WebElement signin=driver.findElement(By.xpath("//*[@id='details']")); //trending click
	signin.click();
}


@AfterMethod
public void browserclose() throws InterruptedException
{
	Thread.sleep(2000);
	

}
}
