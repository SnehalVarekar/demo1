import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneRing2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluestone.com/");
		Thread.sleep(5000);
WebElement ring=driver.findElement(By.xpath("//a[@href=\"https://www.bluestone.com/jewellery/rings.html\"]/parent::li[@class=\"menuparent repb\"]"));
      Actions a = new Actions(driver);
      Thread.sleep(5000);
      a.moveToElement(ring).build().perform();
     
WebElement diamand=driver.findElement(By.xpath("//ul[@class=\"two-col\"]/descendant::li/a[@href=\"https://www.bluestone.com/jewellery/diamond-rings.html\"]"));
Thread.sleep(5000);
         diamand.click();
WebElement price=driver.findElement(By.xpath("//span[contains(.,'Price')]/parent::section[@class=\"block\"]"));
          
         a.moveToElement(price).build().perform();
         System.out.println(price.getText());
	}

}
