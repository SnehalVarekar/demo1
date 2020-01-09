import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleScrollby 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
         WebElement search	=	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
         search.sendKeys("java",Keys.ENTER);
         Thread.sleep(5000);
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
         WebElement next =driver.findElement(By.xpath("//span[text()='Next']"));
		   next.click();
		  // while(next.isEnabled())
			   
			   
			   
			   
	}

}
