package pkg1;

import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YotubeClickHistoryTC2 
{
WebDriver driver;
@BeforeMethod
public void browserOpen()
{
	System.setProperty("webdriver.chrome.driver","../SeleniumClasses/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();

}
@Test
public void historyclick() throws InterruptedException
{
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a/*/yt-formatted-string[contains(text(),'History')]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a/*/yt-formatted-string[contains(text(),'Library')]")).click();
	//driver.findElementBy("//tp-yt-paper-item[role='tab')]").click();
	driver.findElement(By.xpath("//tp-yt-paper-item[role='tab' or class='style-scope ytd-guide-entry-renderer' or tabindex='0')]")).click();
}
@AfterMethod
public void browserClose() throws InterruptedException
{
	Thread.sleep(2000);

}
}
