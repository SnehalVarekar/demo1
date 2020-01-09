import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookReadExcel 
{      
	public void tc() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		ArrayList<String> username=readExcelData(0);
		ArrayList<String> password=readExcelData(1);
		for(int i=0;i<username.size();i++)
		{
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(username.get(i));
		driver.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]")).sendKeys(password.get(i));
		driver.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]")).click();
		}
	}
		
	public ArrayList<String> readExcelData(int colNo) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(".//Data//sssssss.xlsx");//
		Workbook wb = WorkbookFactory.create(fis);// 
	    Sheet sh=wb.getSheet("Sheet1");
	     Iterator<Row> rowIterator=sh.iterator();
	     rowIterator.next();
	     ArrayList<String> list= new ArrayList<String>();
	     while (rowIterator.hasNext()) 
	     {
			 list.add(rowIterator.next().getCell(colNo).getStringCellValue());
			
		}
		return list;
	}
	  public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		  FaceBookReadExcel fb=new FaceBookReadExcel();
		  fb.tc();
		
	}
 }