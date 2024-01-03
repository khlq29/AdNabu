package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericUtils.BaseClass;


public class Tc extends BaseClass{
	@Test(priority = 0)
	public void tc1() throws Throwable {
		
		wLib.waitUntillPageLoad(driver);
		
		//HomePage hmpg = new HomePage(driver);
		
		//hmpg.getSearcbtn().click();
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/header/details-modal/details/summary/span"));
		wLib.mouseHover(driver, element);
		wLib.leftClick(driver, element);
		
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"Search-In-Modal-1\"]"));
		inputElement.sendKeys(fLib.getPropertyKeyValue("myText"));
		//wLib.pressEnterKey();
		wLib.enter(driver, inputElement);
		Thread.sleep(1000);	
	}

	
	@Test(priority = 1)
	public void tc2() throws Throwable{
		
		WebElement availFilter = driver.findElement(By.xpath("//*[@id=\"Details-1-template--14768207462497__main\"]/summary/div/span"));
		availFilter.click();
		driver.findElement(By.xpath("//*[@id=\"Facet-1-template--14768207462497__main\"]/fieldset/ul[1]/li[1]/label/span[1]")).click();
		Thread.sleep(2000);
		//wLib.SelectOption(availFilter, 1);
		
		
		WebElement sortFilter = driver.findElement(By.xpath("//*[@id=\"SortBy\"]"));
		wLib.SelectOption(sortFilter, 1);
		Thread.sleep(1000);	
		
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"product-grid\"]/ul"));
		wLib.scrollToWebElement(driver, scroll);
		Thread.sleep(1000);
		
		//WebElement productClick = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/ul/li[1]/div/div/div[2]/div[1]/h3/a"));
		//wLib.mouseHover(driver, productClick);
		//wLib.leftClick(driver, productClick);
		
		wLib.mouseMove(300, 300);
		wLib.mouseLeftClick();
		wLib.mouseLeftClick();

		Thread.sleep(1000);
	}
	
	
	@Test(priority = 2)
	public void tc3() throws Throwable{
		
		driver.findElement(By.xpath("//*[@id=\"Quantity-Form-template--14768207495265__main\"]/div[1]/quantity-input/button[2]")).click();
		wLib.mouseMove(1000, 650);
		wLib.mouseLeftClick();
		
		Thread.sleep(5000);
	}
	
}
