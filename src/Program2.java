import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launchig Browser..");
		driver.manage().window().maximize();
		driver.get("https://iqgenie.org/");
		driver.findElement(By.xpath("//i[@class=\"person fas fa-user-circle\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class=\"hollow button alert\"]")).click();
		Thread.sleep(5000);
		Set<String> parent = driver.getWindowHandles();
		for(String child:driver.getWindowHandles())
       	 
        {
            driver.switchTo().window(child);
        }
		String s1=driver.getTitle();
		System.out.println(s1);
	}

}
