package objectRepositoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.BaseClass;

public class HomePage extends BaseClass {
	
	//class add as constructor and extend baseclass
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="/html/body/div[3]/div/header/details-modal/details/summary/span")
	private WebElement SearchBtn;
	
	public WebElement getSearcbtn() {
		return SearchBtn;
	}
	
	@FindBy(xpath ="//input[@id='Search-In-Modal-1']")
	private WebElement SearchBar;

	public WebElement getSearchBar() {
		return SearchBar;
	}
	
	
}
