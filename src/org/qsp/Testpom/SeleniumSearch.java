package org.qsp.Testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.Pom.TestSeleniumSearch;

public class SeleniumSearch 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launching Browser..");
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		Thread.sleep(2000);
		TestSeleniumSearch ts= new TestSeleniumSearch(driver);
		ts.searchText("Testing");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		ts.searchText("java");
		
		
	}

}
