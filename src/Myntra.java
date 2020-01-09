import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Myntra.com/");
		Thread.sleep(10000);
		List<WebElement> menu=driver.findElements(By.xpath("//div[@class=\"desktop-navLinks\"]/div"));
		for(WebElement items: menu)
		{
			System.out.println(items.getText());
		}
		
	}

}
