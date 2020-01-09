import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis=new FileInputStream(".//Data//sssssss.xlsx");//path of excel file from data folder
		Workbook wb = WorkbookFactory.create(fis);// all import in ss.usermodel
	    Sheet sh=wb.getSheet("Sheet1");
	     Row firstRow= sh.getRow(0);
	     int rowCount =sh.getPhysicalNumberOfRows();
	     for(int i=0;i<rowCount;i++)
	     {
	    	 for(int j=0;j<firstRow.getLastCellNum();j++)
	    	 {
	    		 Cell c1=sh.getRow(i).getCell(j);
	    		 System.out.print(c1+ " ");
	    		
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("--------------");
	     System.out.println(sh.getRow(2).getCell(1).toString());//cell convert to to string
	     System.out.println(System.getProperty("user.dir"));
	    
	
		          
		
	}

}
