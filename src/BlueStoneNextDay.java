import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BlueStoneNextDay
{
	@Test
	public void demo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluestone.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class=\"form-text typeahead\"]")).sendKeys("Ring");
		driver.findElement(By.xpath("//input[@name=\"submit_search\"]")).click();
		
WebElement time	=driver.findElement(By.xpath("//span[@class=\"title style-fill i-right\"]/span[contains(.,'Delivery Time')]"));

              Actions a = new Actions(driver);
                a.moveToElement(time).build().perform();
                
                
        driver.findElement(By.xpath("//span[@data-displayname=\"next day delivery\"]")).click();
    WebElement total=    driver.findElement(By.xpath("//span[@class=\"total-designs\"]"));
           Reporter.log("no of rings:"+ total.getText(),true);
           driver.close();


	}
}
