import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluestone.com/");
		Thread.sleep(10000);
WebElement jewellry=driver.findElement(By.xpath("//a[@href=\"https://www.bluestone.com/jewellery.html\"]"));
        System.out.println(jewellry.getText());
		Actions a = new Actions(driver);
		Thread.sleep(10000);
		a.moveToElement(jewellry).build().perform();
		Thread.sleep(10000);
         WebElement kadas=driver.findElement(By.xpath("//a[@title=\"Kadas\"]"));
         Thread.sleep(10000);
          System.out.println(kadas.getText());
          kadas.click();
          Thread.sleep(10000);
          driver.findElement(By.xpath("//img[@alt=\"The Ranveer Kada for Him\"]")).click();
		
		
		
		
		
		
	}

}
