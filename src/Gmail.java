import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launchig Browser..");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		//Thread.sleep(2000);
		WebElement email =driver.findElement(By.id("identifierId"));
		email.sendKeys("sneha.varekar393@gmail.com");
		WebElement next1 = driver.findElement(By.id("identifierNext"));
		next1.click();
		//Thread.sleep(5000);
		 driver.findElement(By.name("password")).sendKeys("Sneha@393",Keys.ENTER);
			Thread.sleep(5000);
		 WebElement next2 = driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]"));
			next2.click();
		
	}

}
