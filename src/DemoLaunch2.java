import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch2 
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 System.out.println("Launching Browser");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/");
		 String parent=driver.getWindowHandle();
		 System.out.println(parent);
		 Set<String> wins=driver.getWindowHandles();
		 wins.remove(parent);
		  for(String win : wins)
		 {
			 System.out.println(win);
			 driver.switchTo().window(win);
			 driver.close();
		 }
		
	}

}