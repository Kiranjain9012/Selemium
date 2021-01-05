package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPagePF {

	WebDriver driver;
	
	public ForgotPasswordPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	By emailId = By.name("txtlogin");
//	By nextButton = By.xpath("//input[@name='next']");

	@FindBy(name="txtlogin")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='next']")
	WebElement nextButton;
	
	
	public WebElement emailId() {
		return emailId;

	}

	public WebElement clickNext() {
		return nextButton;

	}

}
