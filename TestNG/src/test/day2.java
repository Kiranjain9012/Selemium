package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "smoke" })
	public void day2Demo() {

		System.out.println("Day2 - First TC");
	}

	@Parameters({ "URL", "Username" })
	@Test
	public void day2Demo1(String urlname, String uName) {

		System.out.println("Day2- Exclude TC");
		System.out.println(urlname);
		System.out.println(uName);
	}
	
	@Test(dataProvider="getData")
	public void credentials(String uname, String pword) {
		
		System.out.println(uname);
		System.out.println(pword);
	}

	@AfterSuite
	public void day2Demo2() {

		System.out.println("Day2 - I am the last TC to be executed in suite");
	}

	@DataProvider
	public Object[][] getData() {
		// Delcare array object based on the parameters
		// combination of Username and Password for 3 set hence [3][2]
		Object[][] data = new Object[3][2];
		
		// 1st data set
		data[0][0] = "user1";
		data[0][1] = "pword1";
		
		//2nd data set
		data[1][0] = "user2";
		data[1][1] = "pword2";
		
		//3rd data set
		data[2][0] = "user3";
		data[2][1] = "pword3";
		return data;
	}
}

