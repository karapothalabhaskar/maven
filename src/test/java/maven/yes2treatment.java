package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yes2treatment 
{
	
	WebDriver driver;
	@BeforeTest
	public void Login() throws Exception
	{
		System.out.println("hello we are in yes2treatment application");
		System.setProperty("webdriver.gecko.driver","D:/selenium Projects/geckodriver/V0.15.0/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://202.83.19.104/yes2treatment/index/home");
		driver.findElement(By.xpath("//*[@id=\"navigation-example\"]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin@yes2treatment.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"loginbtn\"]")).click();		
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
		//driver.quit();
		System.out.println("coming out of yes2treatment Application");
	}

}
