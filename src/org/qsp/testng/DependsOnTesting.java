package org.qsp.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnTesting 
{
	@Test(dependsOnMethods = "demo2")
	public void demo()
	{
		Reporter.log("Hi",true);
	}
	@Test
	public void demo1()
	{
		Reporter.log("Hi1",true);
	}
	@Test(dependsOnMethods = "demo1")
	public void demo2()
	{
		Reporter.log("Hi2",true);	
	}
	@Test
	public void demo3()
	{
		Reporter.log("Hi3",true);	
	}


}
// it will executes sequence wise....