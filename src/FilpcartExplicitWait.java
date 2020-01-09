import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilpcartExplicitWait 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebDriverWait w = new WebDriverWait(driver,25);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
         WebElement iphone	=	driver.findElement(By.xpath("//input[@type=\"text\"]"));
         iphone.sendKeys("iphone");
         
          //WebElement list =     driver.findElement(By.xpath("//input[@value=\"iphone\"]"));
          //System.out.println(list.getText());
        		 
        	
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
		
	}

}
