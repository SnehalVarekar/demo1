import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneHomeWork2 
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
		 String s1=driver.getTitle();
		 System.out.println(s1);
WebElement month=driver.findElement(By.xpath("//input[@class=\"text-input form-control required numeric multiple-of_100 min-value_1000\"]"));
		      month.sendKeys("5000");
WebElement email=driver.findElement(By.xpath("//input[@class=\"text-input form-control required email elowrcase input-lowercase\"]"));
	           email.sendKeys("sneha5665@gmail.com");
	        driver.findElement(By.xpath("//input[@class=\"btn btn-new col-xs-3\"]")).click();
	        Thread.sleep(5000);
	        String s2=driver.getTitle();
	        System.out.println(s2);
	        Thread.sleep(5000);
	        if(s1.equals(s2))
	        {
	        	System.out.println("Reflected in this page");
	        }
	        else
	        {
	        	System.out.println("Reflected in next page");
	        }
	        driver.close();
	
	
	}

}
