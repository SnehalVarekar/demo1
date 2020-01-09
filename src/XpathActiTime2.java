import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActiTime2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		WebElement admin=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		String name1 =admin.getText();
		System.out.println(name1);
		WebElement manager=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		String name2 =manager.getText();
		System.out.println(name2);
		driver.findElement(By.xpath("//input[@placeholder=\'Username\']")).sendKeys(name1);
		driver.findElement(By.xpath("//input[@placeholder=\'Password\']")).sendKeys(name2);
		driver.findElement(By.xpath("//td[@valign=\"top\"]/a[@href=\"javascript:void(0)\"]")).click();
		
	}

}
