package com.demo.practiceTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DemoBrowserTest 
{
	@Test
	public static void main(String[] args) 
	{
		String browser = System.getProperty("BROWSER");
		System.out.println(browser);
	}
}
