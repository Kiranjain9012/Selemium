import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(textBox)).getText());
		
		WebElement emailText = driver.findElement(By.cssSelector("[label='Email"));
		driver.findElement(withTagName("input").below(emailText)).sendKeys("AASAsS@G.COM");
	}

}
