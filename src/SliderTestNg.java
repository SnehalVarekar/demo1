import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTestNg 
{
	@Test
	public void demo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(5000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(frame);
WebElement slider=driver.findElement(By.xpath("//div[@class=\"ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\"]"));

            Actions a = new Actions(driver);
             a.dragAndDropBy(slider, 500, 0).perform();
}

	}


