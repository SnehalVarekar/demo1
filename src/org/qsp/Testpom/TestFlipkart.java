package org.qsp.Testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.Pom.FilpkartHome;

public class TestFlipkart 
{  
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		FilpkartHome fh= new FilpkartHome(driver);
		Thread.sleep(5000);
		fh.close2();
		Thread.sleep(5000);
		fh.searchTxt("iphone");
		fh.clickB();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		fh.searchTxt("Nike");
		fh.clickB();
		
	}

}
