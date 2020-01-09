import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UranLadderProgram1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@href=\"../../furniture-stores?src=header\"]")).click();
 List<WebElement> list=driver.findElements(By.xpath("//h3[@class=\"_3JJeW\"]"));
             for(WebElement list1: list)
             {
            	 System.out.println(list1.getText());
             }
	}

}
