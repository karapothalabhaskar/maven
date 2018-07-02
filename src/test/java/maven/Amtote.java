package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amtote 
{
	WebDriver driver;
	@BeforeTest
	public void login() throws Exception
	{
		System.out.println("hello GWG Application");
		System.setProperty("webdriver.gecko.driver","D:/selenium Projects/geckodriver/V0.15.0/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://13.76.131.82/DevGwg_HHE/Account/Login.aspx");
		driver.findElement(By.xpath("//*[@id=\"MainContent_UserName1\"]")).sendKeys("guest");
		driver.findElement(By.xpath("//*[@id=\"MainContent_Password1\"]")).sendKeys("amtote");
		driver.findElement(By.xpath("//*[@id=\"MainContent_LoginButton\"]")).click();
		Thread.sleep(1000);	
	}
	@Test
	public void AddUser()
	{
		System.out.println("we are creating the user here");
	}
	@AfterTest
	public void DeleteUser()
	{
		System.out.println("we are deleting the created user and exit form the application");
		System.out.println("coming out of GWG Application");
		driver.close();
	}

}
