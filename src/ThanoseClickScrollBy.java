import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThanoseClickScrollBy 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement thanose=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
         thanose.sendKeys("thanose",Keys.ENTER);
       JavascriptExecutor js= (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,500)");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//canvas[@jsname=\"wvK4k\"]")).click();
	}

}
