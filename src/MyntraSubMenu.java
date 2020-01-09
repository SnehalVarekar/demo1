import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraSubMenu
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Myntra.com/");
		Thread.sleep(10000);
		List<WebElement> menu=driver.findElements(By.xpath("//div[@class=\"desktop-navLinks\"]/div"));
		Actions a = new Actions(driver);
		for(WebElement items: menu)
		{ 
			a.moveToElement(items).build().perform();
			String sub = items.getText();
			String s = sub.substring(0,1)+sub.substring(1).toLowerCase();
			System.out.println(s);
			
		
		}
		
	}


}
