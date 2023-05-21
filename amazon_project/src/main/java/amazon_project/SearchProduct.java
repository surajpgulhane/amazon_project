package amazon_project;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct
{	
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox'] ")
	private WebElement search;
	
	@FindBy (xpath ="//input[@id='nav-search-submit-button']")
	private WebElement searchbtn;
	
//	@FindBy (xpath ="(//span[text()='Apple iPhone 14 (128 GB) - Midnight'])[3]")
//	private WebElement mobile;
//	
//	@FindBy (xpath ="//span[text()='529 ratings']")
//	private WebElement rating;
	
	
	
	
			
	public SearchProduct(WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void EnterSearchProductName() 
	{
		search.sendKeys("iphone 14");
		
	}
	
	public void ClickSearchButton() {
		
		searchbtn.click();;
		System.out.println(" search product");
	}
	
	
	
	
}
