import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRobot 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
         WebElement search	=	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
         search.sendKeys("java",Keys.ENTER);
         Thread.sleep(5000);
         String s1 = driver.getTitle();
         System.out.println(s1);
         WebElement java=driver.findElement(By.xpath("//span[text()='Java']"));
         Actions a= new Actions(driver);
         a.doubleClick(java).build().perform();
         
         Robot r = new Robot();
         r.keyPress(KeyEvent.VK_CONTROL);
 		 r.keyPress(KeyEvent.VK_C);
 		 r.keyRelease(KeyEvent.VK_C);
 		 r.keyRelease(KeyEvent.VK_CONTROL);
 		 
        
         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(5000);
         
         r.keyPress(KeyEvent.VK_CONTROL);
 		 r.keyPress(KeyEvent.VK_V);
 		 r.keyRelease(KeyEvent.VK_V);
 		 r.keyRelease(KeyEvent.VK_CONTROL);
 		 r.keyPress(KeyEvent.VK_ENTER);
 		 r.keyRelease(KeyEvent.VK_ENTER);
 		 
 		 String s2= driver.getTitle();
 		 System.out.println(s2);
 		 if(s1.equals(s2))
 		 {
 			 System.out.println("Title is same.....");
 		 }
 		 
		
	}

}
