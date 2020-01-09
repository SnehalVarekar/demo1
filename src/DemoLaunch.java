import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Launching browser");
         Thread.sleep(2000);
         driver.manage().window().maximize();
		//driver.get("https://selenium.dev/");//second method to close the window
         driver.navigate().to("https://www.google.com/");
         System.out.println("Loading url");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		
		//driver.close();
		driver.quit();
	
		
		
	}

}
