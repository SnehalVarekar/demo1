import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProviderReadExcel1 
{
	@Test(dataProviderClass = DataProviderReadExcel.class,dataProvider ="createUser" )
	public void test(String user,String pass)
	{
		Reporter.log(user,true);
		Reporter.log(pass,true);
	}

}
