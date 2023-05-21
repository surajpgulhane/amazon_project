package amazon_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	WebDriver driver;
	AddToCard obj3;
	
	@BeforeTest
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\soft testing\\chomeDriver april 2023\\chromedriver.exe");
	     driver = new ChromeDriver();
	     System.out.println("Before Class ");
	     driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		obj3=new AddToCard(driver);
		System.out.println(" before Class test TestClass3");
		
	}
	
	
	@Test
	public void TestC() throws InterruptedException {
		
		obj3.SelectRating();
		
		obj3.AddTocardProduct();
		
		System.out.println("  test 3");
	}
	
	@AfterTest
	public void AfterClass() {
		
		System.out.println(" AfterClass test TestClass3");
	}
	
	

}
