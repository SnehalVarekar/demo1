import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBoookk 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
WebElement day=driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));   
          Select s = new Select(day);
          s.selectByValue("3");

WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
           Select s1 = new Select(month);
           s1.selectByValue("8");
	}

}
