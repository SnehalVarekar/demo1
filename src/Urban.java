import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urban 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		WebElement decor=driver.findElement(By.xpath("//li/span[contains(.,'Decor')]"));
		System.out.println(decor.getText());
		WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		System.out.println(sale.getText());
		
//List<WebElement> sub=driver.findElements(By.xpath("//span[contains(.,'Sale')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"))
			
	}

}
