import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BlueStoneTestng 
{
	@Test
	public void demo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluestone.com/");
		driver.findElement(By.xpath("//div[@class=\"gms-banner-inner\"]")).click();
		Thread.sleep(5000);
		 String s1=driver.getTitle();
		 Reporter.log(s1,true);
WebElement month=driver.findElement(By.xpath("//input[@class=\"text-input form-control required numeric multiple-of_100 min-value_1000\"]"));
		      month.sendKeys("5000");
WebElement email=driver.findElement(By.xpath("//input[@class=\"text-input form-control required email elowrcase input-lowercase\"]"));
	           email.sendKeys("sneha5665@gmail.com");
	        driver.findElement(By.xpath("//input[@class=\"btn btn-new col-xs-3\"]")).click();
	        Thread.sleep(5000);
	        String s2=driver.getTitle();
	        Reporter.log(s2,true);
	        Thread.sleep(5000);
	        if(s1.equals(s2))
	        {
	        	Reporter.log("Reflected in this page",true);
	        }
	        else
	        {
	        	Reporter.log("Reflected in next page",true);
	        }
	}

}
