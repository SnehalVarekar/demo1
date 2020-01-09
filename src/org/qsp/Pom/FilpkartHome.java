package org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilpkartHome 
{
	@FindBy(xpath = "//button[@class=\"_2AkmmA _29YdH8\"]")
	private WebElement cl;
	@FindBy(xpath = "//input[@title=\"Search for products, brands and more\"]")
	private WebElement search;
	@FindBy(xpath = "//button[@class=\"vh79eN\"]")
	private WebElement button;
	
	public FilpkartHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void close2()
	{
		cl.click();
	}
       public void searchTxt(String txt)
       {
    	   search.sendKeys(txt);
       }
       public void clickB()
       {
    	   button.click();
       }
}
