import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookRadExcel1
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		FileInputStream fis=new FileInputStream(".\\Data\\sssssss.xlsx");//path of excel file from data folder
		Workbook wb = WorkbookFactory.create(fis);// all import in ss.usermodel
	    Sheet sh=wb.getSheet("Sheet1");
	     Row firstRow= sh.getRow(0);
	     int rowCount =sh.getPhysicalNumberOfRows();
	     
	     WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	     email.sendKeys(sh.getRow(2).getCell(0).toString());
	     
	     WebElement password=driver.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]"));
	     password.sendKeys(sh.getRow(2).getCell(1).toString());
	     
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]")).click();
		
	}

}
