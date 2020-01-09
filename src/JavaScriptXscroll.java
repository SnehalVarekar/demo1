import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptXscroll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		JavascriptExecutor ts= (JavascriptExecutor)driver;
		ts.executeScript("window.scrollBy(500,0)");//left to right
		Thread.sleep(2000);
		ts.executeScript("window.scrollBy(-500,0)");//right to left
		Thread.sleep(2000);
		ts.executeScript("window.scrollTo(document.body.Scrollwidth,0)");
		Thread.sleep(2000);
		ts.executeScript("window.scrollTo(-document.body.Scrollwidth,0)");
	}

}
