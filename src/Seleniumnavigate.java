import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumnavigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launching Browser..");
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@class=\"gsc-input\"]"));
		search.sendKeys("Testing",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		search.sendKeys("java",Keys.ENTER);
	}

}
