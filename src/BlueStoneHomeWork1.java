import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneHomeWork1 
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
		driver.findElement(By.xpath("//input[@class=\"btn btn-new col-xs-3\"]")).click();
		driver.close();
		
	}

}
