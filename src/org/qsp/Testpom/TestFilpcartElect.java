package org.qsp.Testpom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.qsp.Pom.FilpcartElec;

public class TestFilpcartElect
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		FilpcartElec fe= new FilpcartElec(driver);
		fe.popup();
		Thread.sleep(5000);
		fe.electronic(driver);
		Thread.sleep(5000);
		fe.mobile();
		Thread.sleep(5000);
		fe.cell();
		Thread.sleep(5000);
		Set<String> parent = driver.getWindowHandles();
		for(String child:driver.getWindowHandles())
       	 
        {
            driver.switchTo().window(child);
        }
		
		
		fe.add();
	}

}
