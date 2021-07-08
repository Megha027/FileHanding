package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","../SeleniumClasses/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  // Opening the website

		driver.manage().window().maximize();  //Maximize the window
		
		driver.close();  // Close the browser
	}
}