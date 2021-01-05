package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	private By email = By.id("user_email");
	private By sendInstruction = By.xpath("//input[@value='Send Me Instruction']");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getSendInstructions() {
		return driver.findElement(sendInstruction);
	}

}
