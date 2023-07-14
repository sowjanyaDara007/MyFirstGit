package firstSelnum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) throws InterruptedException 
	{
	//crt object for WebDriver & Launch WEbDriver
		
		
		WebDriver driver=new ChromeDriver();
		
		//Wd is Interface,CD class is implementing  webdriver & accessing all common methods  of wD and utilizing it as its own.
		//here name of class[WebDriver] is not same as Constructor[ChromeDriver]
		//pOLYMORPHISM ALLOWS THIS CONCEPT OF CREATING an object[driver using new to access the methods from constructor in	webddriver
	
	//Fetch WebSite
	
	 driver.get("https://www.google.com/" );
	 
	//if u excute it i got google search page appear in new window
	//Maximize Browser
	 driver.manage().window().maximize();
	 //Type Selenium
	driver.findElement(By.name("q")).sendKeys("selenium123");
	
	Thread.sleep(3000);
	//close Browser
	driver.close();
	
	
	}
}
