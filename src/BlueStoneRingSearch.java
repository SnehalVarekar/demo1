import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneRingSearch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluestone.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class=\"form-text typeahead\"]")).sendKeys("Ring");
		driver.findElement(By.xpath("//input[@name=\"submit_search\"]")).click();
	}

}