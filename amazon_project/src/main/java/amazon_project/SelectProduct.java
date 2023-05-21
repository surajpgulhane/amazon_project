package amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
	
	WebDriver driver;
	
	@FindBy (xpath ="(//span[text()='Apple iPhone 14 (128 GB) - Yellow'])[1]")
	private WebElement apple;

	
	public SelectProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void SelectPro()
	{
		apple.click();
	}
}
