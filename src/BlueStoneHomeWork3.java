import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneHomeWork3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://bluestone.com/");
		driver.findElement(By.xpath("//div[@class=\"gms-banner-inner\"]")).click();
		Thread.sleep(5000);
WebElement month=driver.findElement(By.xpath("//input[@class=\"text-input form-control required numeric multiple-of_100 min-value_1000\"]"));
		      month.sendKeys("5000");
WebElement email=driver.findElement(By.xpath("//input[@class=\"text-input form-control required email elowrcase input-lowercase\"]"));
	           email.sendKeys("sneha456@gmail.com");
	        driver.findElement(By.xpath("//input[@class=\"btn btn-new col-xs-3\"]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@class=\"submit-checkout-save-address btn btn-s btn-pdp\"]")).click();
	        Thread.sleep(4000);
	        driver.close();
		
	}

}
