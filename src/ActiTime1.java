import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		WebElement name1 = driver.findElement(By.name("username"));
		name1.sendKeys("admin");
		WebElement name2 = driver.findElement(By.name("pwd"));
		name2.sendKeys("manager");
		WebElement id = driver.findElement(By.id("loginButton"));
		id.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		WebElement user = driver.findElement(By.id("container_users"));
		user.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}

}
