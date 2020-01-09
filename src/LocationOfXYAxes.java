import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfXYAxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching Browser..");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
WebElement login=driver.findElement(By.xpath("//label[@class=\"login_form_login_button uiButton uiButtonConfirm\"]"));
		Point loc=login.getLocation();
		System.out.println(loc);
		//or
		int x=loc.getX();
		int y =loc.getY();
		System.out.println(x+" "+y);
	}

}
