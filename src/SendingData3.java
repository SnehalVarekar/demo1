import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");;
		Thread.sleep(2000);
		 String s1= driver.getTitle();
		 System.out.println(s1);
	     WebElement name =driver.findElement(By.name("username"));
	     name.sendKeys("admin");
	     WebElement name1 =driver.findElement(By.name("pwd"));
	     name1.sendKeys("manager");
	     WebElement next=driver.findElement(By.id("loginButton"));
	     next.click();
	     Thread.sleep(5000);
	     String s2 = driver.getTitle();
	     System.out.println(s2);
	     if(s1!=(s2))
	    {
	     System.out.println("Login succesfully");
	     WebElement logout = driver.findElement(By.id("logoutLink"));
	     logout.click();
	    }
	     String logout =driver.getTitle();
	     System.out.println(logout);
	     if(s1.equals(logout))
	     {
	    	 System.out.println("LOgout succesfully");
	     }
	    	
		
	}

}
