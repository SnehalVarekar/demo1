import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertList 

{
	@Test
	public void demo()
	{
		List l= new ArrayList<>();
		l.add("Sneha");
		l.add(19);
		l.add(true);
		
		List l1=new ArrayList<>();
		l1.add("Sneha");
		l1.add(9);
		l1.add(true);
		//Assert.assertEquals(l, l1);
		//System.out.println("Valid");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(l, l1);// actual or expected are not same it will go next line and execute
		System.out.println("Hello");
		sa.assertAll();// print the report fail or pass
	}

}
