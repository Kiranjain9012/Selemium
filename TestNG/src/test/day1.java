package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Day1-Before Class TC");
	}

	@AfterTest
	public void day1Demo3() {

		System.out.println("Day1- Last TC to be executed under test name Test");
	}

	@Parameters({"URL"})
	@Test
	public void day1Demo(String Urlname) {

		System.out.println("Day 1 First TC");
		System.out.println(Urlname);
	}

	@Test(groups= {"smoke"})
	public void day1Demo1() {

		System.out.println("Day 1 Second TC");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Day1- After Class TC");
	}
}
