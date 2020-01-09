import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleWithoutUsegetTitle 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("Title of WebPage by getTitle method: "+driver.getTitle());
		WebElement titleEle=driver.findElement(By.tagName("title"));
		System.out.println("Title of WebPage by webelement title:"+titleEle.getAttribute("textcontent"));
		
	}

}
