package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffLoginPagePF {
	
	WebDriver driver;
	
	public rediffLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	By username = By.xpath("//input[@name='login']");
//	By password = By.cssSelector("input[id='password']");
//	By singIn = By.cssSelector(".signinbtn");
//	By forgotPassword = By.linkText("Forgot Password?");
	
	@FindBy(xpath="//input[@name='login']")
	WebElement username;
	
	@FindBy(css="input[id='password']")
	WebElement password;
	
	@FindBy(css=".signinbtn")
	WebElement signIn;
	
	@FindBy(linkText="Forgot Password?")
	WebElement forgotPassword;
	
	
	public WebElement emailId() {
		return username;
	}
	public WebElement password() {
		return password;
	}
	
	public WebElement clickSignIn() {
		return signIn;
	}

	public WebElement forgotPword() {
		return forgotPassword;
	}
}
