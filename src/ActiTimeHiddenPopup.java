import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeHiddenPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		WebElement name1 = driver.findElement(By.name("username"));
		name1.sendKeys("admin");
		WebElement name2 = driver.findElement(By.name("pwd"));
		name2.sendKeys("manager");
		WebElement id = driver.findElement(By.id("loginButton"));
		id.click();
		driver.findElement(By.xpath("//div[@class=\"menuTable\"]/descendant::div[@class=\"menu_icon\"][3]")).click();
	    driver.findElement(By.xpath("//a[@onclick=\"MenuHandler.openAbout(); return false;\"]")).click();
	    WebElement name=	driver.findElement(By.xpath("//span[text()='© 2019 actiTIME Inc. All rights reserved.']"));
	          System.out.println(name.getText());
	}

}
