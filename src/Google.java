import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
         WebElement java=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
         java.sendKeys("Java");
         Thread.sleep(5000);
          List<WebElement> li = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]"));
         for(WebElement item: li)
         {
        	 System.out.println(item.getText());
         }
         Thread.sleep(5000);
 driver.findElement(By.xpath("//div[@class=\"sbtc\"]/descendant::span/descendant::b[text()='script']")).click();

		
		
	}

}
