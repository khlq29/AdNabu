package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.genericUtils.BaseClass;

import objectRepositoryPages.HomePage;
import objectRepositoryPages.ItemAndCartPage;
import objectRepositoryPages.ItemsPage;

//Product Search
public class Tc extends BaseClass{
	@Test(priority = 0)
	public void tc1() throws Throwable {
		Logger log;
		log = LogManager.getLogger(this.getClass());
		HomePage hmpg = new HomePage(driver);
		
		log.debug("-------Opening Browser------");		
		wLib.mouseHover(driver, hmpg.getSearcbtn());
		log.debug("-------Clicking on Search Button------");
		wLib.leftClick(driver, hmpg.getSearcbtn());
		
		
		hmpg.getSearchBar().sendKeys(fLib.getPropertyKeyValue("myText"));
		log.debug("-------Entering the Search Term------");
		wLib.enter(driver, hmpg.getSearchBar());
		log.debug("-------Clicking Enter------");
		Thread.sleep(1000);	
		
	}

//Filtering
	@Test(priority = 1)
	public void tc2() throws Throwable{
		Logger log;
		log = LogManager.getLogger(this.getClass());
		ItemsPage itm = new ItemsPage(driver);
		
		log.debug("-------Clicking the Availaibility Filter------");
		itm.getAvailFilter().click();
		log.debug("-------Selecting the In Stock Filter------");
		itm.getInStock().click();
		Thread.sleep(2000);	
		
		log.debug("-------Selecting the Drop Down Option-2------");
		wLib.SelectOption(itm.getSortFilter(), 1);
		Thread.sleep(1000);	
		
		log.debug("-------Scrolling to the Items------");
		wLib.scrollToWebElement(driver, itm.getScrollTo());
		Thread.sleep(1000);
		
		log.debug("-------Clicking the First Item------");
		wLib.mouseMove(300, 300);
		wLib.mouseLeftClick();
		wLib.mouseLeftClick();

		Thread.sleep(1000);
	}
	
//Adding and Removing Items from the Shopping Cart
	@Test(priority = 2)
	public void tc3() throws Throwable{
		Logger log;
		log = LogManager.getLogger(this.getClass());
		
		log.debug("-------Clicking the Add Quantity------");
		ItemAndCartPage itc = new ItemAndCartPage(driver);
		itc.getQuantity().click();
		
		log.debug("-------Clicking the Add to Cart Button------");
		wLib.mouseMove(1000, 650);
		wLib.mouseLeftClick();
		
		Thread.sleep(2000);
		log.debug("-------Opening the Cart------");
		itc.getCart().click();
		
		log.debug("-------Removing Item from the Cart------");
		itc.getRmv().click();
		
		Thread.sleep(5000);
		
	}
	
}
