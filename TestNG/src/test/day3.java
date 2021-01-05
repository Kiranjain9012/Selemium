package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Test(groups= {"smoke"})
	public void day3Demo() {
		System.out.println("Day3 - Test case for smoke");
		Assert.assertTrue(false);
	}
	
	@BeforeMethod
	public void day3Demo4() {
		System.out.println("Day3 - I will be executed before every method");
	}

	@BeforeTest
	public void day4Demo1() {
		System.out.println("Day3 - BeforeTest Annotation!! I will run after beforeSutie test");
	}

	@BeforeSuite
	public void day4Demo2() {
		System.out.println("Day3 - BeforeSuite Annotation!! I will run first in gthe suite");
	}
	
	@Test(dependsOnMethods= {"day3Demo6"})
	public void day3Demo5() {
		System.out.println("Day3 - Test case dependent one");
	}
	
	@Parameters({"URL"})
	@Test
	public void day3Demo6(String urlname) {
		System.out.println("Day3 - Test case for day3");
		System.out.println(urlname);
	}
	
	@AfterMethod
	public void day3Demo7() {
		System.out.println("Day3 - I will be executed after every method");
	}

}
