import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Invoke URL
		driver.get("http://the-internet.herokuapp.com/");

		// Maximize the window
		driver.manage().window().maximize();

		// Click on "Multiple Windows" link
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();

		// Click on "Click Here" link
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		// Window Handling code
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();

		// Switch to child window
		driver.switchTo().window(childWindow);

		// Get the text from child window
		String childText = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();

		// Print the text
		System.out.println(childText);

		// Switch back to parent window
		driver.switchTo().window(parentWindow);

		// Get the text from parent window
		String parentText = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();

		// Print the text
		System.out.println(parentText);

	}

}
