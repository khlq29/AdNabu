package objectRepositoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.BaseClass;

public class ItemAndCartPage extends BaseClass {
	
	public ItemAndCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//button[@name='plus']")
	private WebElement Quantity;

	public WebElement getQuantity() {
		return Quantity;
	}

	@FindBy(xpath = "//a[@id='cart-notification-button']")
	private WebElement Cart;

	public WebElement getCart() {
		return Cart;
	}
	
	@FindBy(xpath = "//a[@class='button button--tertiary']")
	private WebElement Rmv;

	public WebElement getRmv() {
		return Rmv;
	}
		
}
