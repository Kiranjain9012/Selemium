package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {

	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By emailId = By.name("txtlogin");
	By nextButton = By.xpath("//input[@name='next']");

	public WebElement emailId() {
		return driver.findElement(emailId);

	}

	public WebElement clickNext() {
		return driver.findElement(nextButton);

	}

}
