import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartHightoLow
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("c#");
		driver.findElement(By.xpath("//button[@class=\"vh79eN\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"_3ywJNQ\"]/descendant::div[contains(.,'Price -- Low to High')]")).click();
		
	}

}
