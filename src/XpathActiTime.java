import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActiTime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		WebElement self = driver.findElement(By.xpath("//td[@id=\'headerContainer\']"));
		String name= self.getText();
		System.out.println(name);
		driver.findElement(By.xpath("//input[@placeholder=\'Username\']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder=\'Password\']")).sendKeys(name);
		driver.findElement(By.xpath("//td[@valign=\"top\"]/a[@href=\"javascript:void(0)\"]")).click();
		Thread.sleep(2000);
		WebElement invalid=driver.findElement(By.xpath("//td[@style=\'padding-left:6px;\']"));
	     System.out.println(invalid.getText());
		//Thread.sleep(2000);below all xpath are correct
		//WebElement invalid=driver.findElement(By.xpath("//td[@valign=\"top\"]/span[@class=\"errormsg\"]"));
		//System.out.println(invalid.getText());
	     //Thread.sleep(2000);
		//WebElement invalid =driver.findElement(By.xpath("//td[@valign='top']/span[@class='errormsg']"));
		//System.out.println(invalid.getText());
	}

}
