package org.qsp.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoList.class)
public class DemoListTestng 
{
	@Test
	public void demo()
	{
		System.out.println("Hi");
	}
	@Test
	public void demo2()
	{
		System.out.println("Hi1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "demo2")
	public void demo3()
	{
		System.out.println("Hi2");
		
	}

}
