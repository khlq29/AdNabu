package objectRepositoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.BaseClass;

public class ItemsPage extends BaseClass {
	public ItemsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//summary[@class='facets__summary caption-large focus-offset']")
	private WebElement AvailFilter;

	
	public WebElement getAvailFilter() {
		return AvailFilter;
	}

	@FindBy(xpath = "//label[@class='facets__label facet-checkbox']")
	private WebElement InStock;

	
	public WebElement getInStock() {
		return InStock;
	}
	
	@FindBy(xpath = "//select[@name='sort_by' and @id = 'SortBy']")
	private WebElement SortFilter;


	public WebElement getSortFilter() {
		return SortFilter;
	}
	
	@FindBy(xpath = "//ul[@class='grid product-grid  grid--2-col-tablet-down grid--4-col-desktop']")
	private WebElement ScrollTo;


	public WebElement getScrollTo() {
		return ScrollTo;
	}



	
}
