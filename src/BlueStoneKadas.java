import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneKadas 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluestone.com/");
		Thread.sleep(5000);
WebElement jewellry=driver.findElement(By.xpath("//a[@href=\"https://www.bluestone.com/jewellery.html\"]"));
        System.out.println(jewellry.getText());
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(jewellry).build().perform();
		Thread.sleep(5000);
		
         WebElement kadas=driver.findElement(By.xpath("//a[@title=\"Kadas\"]"));
         Thread.sleep(5000);
          System.out.println(kadas.getText());
          kadas.click();
          Thread.sleep(5000);
          Set<String> parent=driver.getWindowHandles();
          driver.findElement(By.xpath("//img[@alt=\"The Ranveer Kada for Him\"]")).click();

          Thread.sleep(5000);
         for(String child:driver.getWindowHandles())
        	 
         {
             driver.switchTo().window(child);
         }
         driver.findElement(By.xpath("//input[@class=\"exclusive btn style2 btn-block addToCart\"]")).click();
     
		driver.findElement(By.xpath("//input[@class=\"exclusive btn style2 btn-block addToCart\"]")).click();
WebElement field=driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]"));
           System.out.println(field.getText());
	}

}
