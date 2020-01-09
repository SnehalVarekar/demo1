import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlueStoneHomeWork4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://bluestone.com/");
		driver.findElement(By.xpath("//div[@class=\"gms-banner-inner\"]")).click();
		Thread.sleep(5000);
WebElement month=driver.findElement(By.xpath("//input[@class=\"text-input form-control required numeric multiple-of_100 min-value_1000\"]"));
		      month.sendKeys("5000");
WebElement email=driver.findElement(By.xpath("//input[@class=\"text-input form-control required email elowrcase input-lowercase\"]"));
	           email.sendKeys("minal221@gmail.com");
	        driver.findElement(By.xpath("//input[@class=\"btn btn-new col-xs-3\"]")).click();
	        Thread.sleep(10000);
WebElement mob=driver.findElement(By.xpath("//input[@class=\"required min-length_10 numeric text-input form-control mobile-char mobile-number \"]"));
            mob.sendKeys("7249575353");
	        Thread.sleep(5000);
WebElement name=driver.findElement(By.xpath("//input[@class=\"required min-length_3 max-length_32 word text-input form-control \"]"));
           name.sendKeys("suchita Pawar");
           Thread.sleep(5000);
WebElement add= driver.findElement(By.xpath("//textarea[@class=\"required min-length_6 max-length_200 text-input form-control \"]"));
           add.sendKeys("SasaneNagar Hadpser Pune");
           Thread.sleep(5000);
WebElement pin=driver.findElement(By.xpath("//input[@class=\"required pincode text-input form-control \"]"));
           pin.sendKeys("415122");
           Thread.sleep(5000);
           driver.findElement(By.xpath("//input[@class=\"submit-checkout-save-address btn btn-s btn-pdp\"]")).click();
WebElement nomini =driver.findElement(By.xpath("//input[@class=\"required min-length_3 max-length_32 word text-input form-control\"]"));
           nomini.sendKeys("snehal Varekar");
WebElement relation=driver.findElement(By.xpath("//select[@id=\"nomineeRelationship\"]"));
           Select s = new Select(relation);
           s.selectByValue("Mother");
 WebElement nationality=driver.findElement(By.xpath("//select[@id=\"nomineeNationality\"]"));
             Select s1=new Select(nationality);
             driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
             
	}

}
