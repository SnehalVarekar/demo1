import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRbot 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement name=driver.findElement(By.name("q"));
 		name.sendKeys("java",Keys.ENTER);
 		
 WebElement java=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[contains(.,'Java')]"));
 		 Actions a = new Actions(driver);
 		 a.doubleClick(java).perform();
 		 
 		 Robot r = new Robot();
 		 r.keyPress(KeyEvent.VK_CONTROL);
 		 r.keyPress(KeyEvent.VK_C);
 		 r.keyRelease(KeyEvent.VK_C);
 		 r.keyRelease(KeyEvent.VK_CONTROL);
 		 
 		 
 		 r.keyPress(KeyEvent.VK_CONTROL);
 		 r.keyPress(KeyEvent.VK_T);
 		 r.keyRelease(KeyEvent.VK_T);
 		 r.keyRelease(KeyEvent.VK_CONTROL);
 		 
 		 
 		 
 		 r.keyPress(KeyEvent.VK_CONTROL);
 		 r.keyPress(KeyEvent.VK_V);
 		 r.keyRelease(KeyEvent.VK_V);
 		 r.keyRelease(KeyEvent.VK_CONTROL);
 		 
	}

}
