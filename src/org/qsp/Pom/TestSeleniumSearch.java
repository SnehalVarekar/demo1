package org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestSeleniumSearch 
{
	@FindBy(xpath = "//input[@name=\"search\"]") 
	private WebElement search;
	
	public TestSeleniumSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void searchText(String text)
	{
		search.sendKeys(text,Keys.ENTER);
	}
	

}
