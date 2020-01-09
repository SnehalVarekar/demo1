import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag  
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
WebElement drag=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(drag);
WebElement dragable	=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
      Actions a  = new Actions(driver);
     // a.dragAndDropBy(dragable, 150, 20).perform();//1st way
      
      WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
      a.dragAndDrop(dragable,drop).perform();//second way to drag drop
      System.out.println(drop.getText());
	}

}
