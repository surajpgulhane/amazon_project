package amazon_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilityClass.utility;



public class Test_Class 
{	SearchProduct obj1;
  //  SelectProduct obj2;
  //  AddToCard obj3;
	
	WebDriver driver;
	
	@BeforeTest
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\soft testing\\chomeDriver april 2023\\chromedriver.exe");
	     driver = new ChromeDriver();
	     System.out.println("Before Class ");
	     driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		obj1= new SearchProduct(driver);
	//	obj2= new SelectProduct(driver);
	 //   obj3=new AddToCard(driver);
		System.out.println(" before test TestClass1");
		
	}
			
			
	
	@Test
	public void TestA() throws IOException, InterruptedException 
	{
		 
		 obj1.EnterSearchProductName();
		 obj1.ClickSearchButton();
		 System.out.println("  test 1");
		 utility.screenshotMethod(driver);
	}
	
//	@Test
//	public void TestB() {
//	    
//		obj2.SelectPro();
//		
//	}
//	
//	@Test
//	public void TestC() throws InterruptedException {
//		
//		obj3.SelectRating();
//		
//		obj3.AddTocardProduct();
//	}
	
	
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println(" After Class testclass 1");
		//driver.close();
	}

}
