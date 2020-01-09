import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 System.out.println("Launching Browser");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.get("https://www.Google.com/");
		 Thread.sleep(2000);
		 WebElement name=driver.findElement(By.name("q"));
		name.sendKeys("java",Keys.ENTER);
WebElement java=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[contains(.,'Java')]"));
		 Actions a = new Actions(driver);
		 a.doubleClick(java).perform();
		 
		
	}

}
