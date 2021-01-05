package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.ForgotPasswordPage;
import objectRepository.ForgotPasswordPagePF;
import objectRepository.rediffLoginPage;
import objectRepository.rediffLoginPagePF;

public class loginApplicationPF {
	
	@Test
	public void logIn() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		rediffLoginPagePF rd = new rediffLoginPagePF(driver);	
		rd.emailId().sendKeys("email");
		rd.password().sendKeys("pword");
//		rd.clickSignIn().click();
		rd.forgotPword().click();
		
		ForgotPasswordPagePF fp = new ForgotPasswordPagePF(driver);
		fp.emailId().sendKeys("email");
		fp.clickNext().click();
		
		
	}

}
