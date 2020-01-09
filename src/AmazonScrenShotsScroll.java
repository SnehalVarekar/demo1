import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazonScrenShotsScroll
{
      public static void main(String[] args) throws InterruptedException, IOException 
      {
    	  System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.Amazon.in/");
  		Thread.sleep(5000);
  		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		File screenSave=new File(".\\ScreenShot\\amazon.png");
		Files.copy(screenShot, screenSave);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		File screenShot1=ts.getScreenshotAs(OutputType.FILE);
		File screenSave1=new File(".\\ScreenShot\\amazon1.png");
		Files.copy(screenShot1, screenSave1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Back to top']")).click();
	}
}
