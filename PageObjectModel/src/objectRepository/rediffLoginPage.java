package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffLoginPage {
	
	WebDriver driver;
	
	public rediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@name='login']");
	By password = By.cssSelector("input[id='password']");
	By singIn = By.cssSelector(".signinbtn");
	By forgotPassword = By.linkText("Forgot Password?");
	
	public WebElement emailId() {
		return driver.findElement(username);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement clickSignIn() {
		return driver.findElement(singIn);
	}

	public WebElement forgotPword() {
		return driver.findElement(forgotPassword);
	}
}
