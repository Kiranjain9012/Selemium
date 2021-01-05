import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Invoke URL
		driver.get("http://www.cleartrip.com");

		// Select adults
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByValue("3");

		// Select Childrens
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByVisibleText("2");

		// Select Infants
		Select infant = new Select(driver.findElement(By.id("Infants")));
		infant.selectByIndex(1);

		// Select Date
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// Click on Link
		driver.findElement(By.id("MoreOptionsLink")).click();

		// Input Preferred Airlines
		driver.findElement(By.name("airline")).sendKeys("Malaysian");

		// Click on Search
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

		// Print Error message
		System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
	}
}