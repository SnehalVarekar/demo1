import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.InvalidAttributesException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidAttributesException, IOException, InterruptedException, InvalidFormatException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launchig Browser..");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		//Thread.sleep(2000);
		FileInputStream fis=new FileInputStream(".//Data//sssssss.xlsx");
		Workbook wb = WorkbookFactory.create(fis); 
	    Sheet sh=wb.getSheet("Sheet1");
	     Row firstRow= sh.getRow(0);
	     int rowCount =sh.getPhysicalNumberOfRows();
	     WebElement email =driver.findElement(By.id("identifierId"));
	     email.sendKeys(sh.getRow(3).getCell(0).toString());
	      WebElement next1 = driver.findElement(By.id("identifierNext"));
		   next1.click();
		Thread.sleep(5000);
		WebElement password=	 driver.findElement(By.name("password"));
		 password.sendKeys(sh.getRow(3).getCell(1).toString());
		        		  
		Thread.sleep(5000);
			 WebElement next2 = driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]"));
				next2.click();
			
		
	}

}
