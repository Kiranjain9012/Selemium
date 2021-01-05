import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "root", "paksh");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name='paksh'");

		while (rs.next()) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://login.salesforce.com");
			
			driver.findElement(By.id("username")).sendKeys(rs.getString("name"));
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(rs.getString("location"));
		}
		
	
	}

}
