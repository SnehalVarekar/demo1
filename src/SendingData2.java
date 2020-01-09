import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData2 
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
		email.sendKeys("sneha.varekar@gmail.com");
		WebElement next = driver.findElement(By.id("identifierNext"));
		next.click();
		//Thread.sleep(5000);
		 driver.findElement(By.name("password")).sendKeys("Sneha@393",Keys.ENTER);//keys is enum just like class
		
		
		
				
		
		
	}

}
