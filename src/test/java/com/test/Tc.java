package com.test;

import org.testng.annotations.Test;

import com.genericUtils.BaseClass;

import objectRepositoryPages.HomePage;

public class Tc extends BaseClass{
	@Test
	public void tc() {
		
		wLib.waitUntillPageLoad(driver);
		
		HomePage hmpg = new HomePage(driver);
		
		
		
	}

}
