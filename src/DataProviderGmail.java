import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderGmail 
{

	@DataProvider
	public String[][] getData()
	{
		String[][] data= new String[3][2];
		data[0][0]="Snehapawar222@gmail.com";
		data[0][1]="Sneha111";
		
		data[1][0]="snehapawar333@gmail.com";
		data[1][1]="Sneha222";
		
		data[2][0]="snehapawar444@gmail.com";
		data[2][1]="Sneha666";
		 return data;
	}
	
   @Test(dataProvider="getData")
   public void createUser(String un,String pw) throws InterruptedException
   {
	   Reporter.log("create: "+ un + " pwd: "+pw,true);
	   System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		WebElement email =driver.findElement(By.id("identifierId"));
		email.sendKeys(un);
		WebElement next1 = driver.findElement(By.id("identifierNext"));
		next1.click();
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.name("password"));
			password.sendKeys(pw);
		 WebElement next2 = driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]"));
			next2.click();
			driver.close();

}

}