package pkg1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOperation 
{
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "../SeleniumClasses/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://en-gb.facebook.com/");
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement name=driver.findElementByName("email");
		name.sendKeys("megha");
		WebElement password=driver.findElementById("pass");
		password.sendKeys("12345");
		WebElement button=driver.findElementByName("login");
		button.click();
		
	}
}
