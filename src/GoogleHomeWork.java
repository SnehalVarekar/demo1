import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleHomeWork 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Thread.sleep(5000);
         WebElement search=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		WebElement hindi=driver.findElement(By.xpath("//a[text()='हिन्दी']"));
		/*Actions a = new Actions(driver);
		 a.click(hindi).perform();*/
		 //Thread.sleep(5000);
		 
		 Robot r = new Robot();
 		 r.keyPress(KeyEvent.VK_CONTROL);
 		 r.keyPress(KeyEvent.VK_C);
 		 r.keyRelease(KeyEvent.VK_C);
 		 r.keyRelease(KeyEvent.VK_CONTROL);
 		 
 	
 		
 		r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		
	}

}
