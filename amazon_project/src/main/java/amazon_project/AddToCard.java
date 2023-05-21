package amazon_project;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCard {
	WebDriver driver;
	
	@FindBy (xpath="//span[@id='acrCustomerReviewText']")
	private WebElement rating;
	
	
	
	
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addProduct;
	
	
	
	
	
	public AddToCard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void SelectRating() throws InterruptedException {
		ArrayList<String> add =new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(add.get(1));
		Thread.sleep(2000);
		String rate=rating.getText();
		System.out.println(rate);
	}
	
	
	public void AddTocardProduct() {
		addProduct.click();
	}
	
	
}
