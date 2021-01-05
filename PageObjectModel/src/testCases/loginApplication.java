package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.ForgotPasswordPage;
import objectRepository.rediffLoginPage;

public class loginApplication {
	
	@Test
	public void logIn() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		rediffLoginPage rd = new rediffLoginPage(driver);	
		rd.emailId().sendKeys("email");
		rd.password().sendKeys("pword");
		rd.clickSignIn().click();
		rd.forgotPword().click();
		
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		fp.emailId().sendKeys("email");
		fp.clickNext().click();
		
		
	}

}
