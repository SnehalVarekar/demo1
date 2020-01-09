import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Abira/Desktop/sneha.html");
WebElement otp	=driver.findElement(By.xpath("//select[@id='b']"));
		
		
		Select s = new Select(otp);
		List<WebElement> values = s.getOptions();
		if(s.isMultiple())
		for(WebElement data: values)
	       {
			System.out.println(data.getText());
			s.selectByValue(data.getText());
		}
		System.out.println("----------"+s.getFirstSelectedOption().getText());
		List<WebElement> selectopt=s.getAllSelectedOptions();
		for(WebElement val:selectopt)
		{
			System.out.println(val.getText());
			//s.deselectByValue(val.getText());
		}
		s.deselectAll();
	
		
	}

}
