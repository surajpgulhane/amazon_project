package amazon_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	WebDriver driver;
	SelectProduct obj2;
	
	@BeforeTest
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\soft testing\\chomeDriver april 2023\\chromedriver.exe");
	     driver = new ChromeDriver();
	     System.out.println("Before Class ");
	     driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			obj2= new SelectProduct(driver);
	 
			System.out.println(" beforeclass TestClass2");
	}
	
	
	@Test
	public void TestB() {
	    
		obj2.SelectPro();
		System.out.println("  test 2");
		
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println(" After class  TestClass2");
	}
}
