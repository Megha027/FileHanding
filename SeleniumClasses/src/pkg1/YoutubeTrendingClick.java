package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeTrendingClick {

	WebDriver driver;

@BeforeMethod
public void browseropen() 
{	
	System.setProperty("webdriver.chrome.driver", "../SeleniumClasses/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
}

@Test
public void click() throws InterruptedException 
{
	//WebElement signin=driver.findElement(By.xpath("//*[@id='details']")); //trending click
	WebElement signin=driver.findElement(By.xpath("//*[@class='style-scope ytd-rich-grid-media']"));// trending click
	signin.click();
	Thread.sleep(2000);

//	WebElement skipad=driver.findElement(By.xpath("//div[contains(text(),'Skip Ad')]"));
//	skipad.click();
}
@AfterMethod
public void close() throws InterruptedException 
{
	Thread.sleep(2000);
//	driver.close();
}
}
