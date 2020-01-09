import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFaceBook
{
	@DataProvider
	public String[][] getData()
	{
		String[][] data= new String[3][2];
		data[0][0]="user A";
		data[0][1]=" A1";
		
		data[1][0]="user B";
		data[1][1]="B1";
		
		data[2][0]="user C";
		data[2][1]="C1";
		 return data;
	}
	
   @Test(dataProvider="getData")
   public void createUser(String un,String pw)
   {
	   Reporter.log("create: "+ un + " pwd: "+pw,true);
	   System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	     email.sendKeys(un);
	     
	     WebElement password=driver.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]"));
	     password.sendKeys(pw);
	     
	     
	     driver.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]")).click();
	     driver.close();
   }

}



