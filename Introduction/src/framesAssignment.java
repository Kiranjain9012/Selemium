import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Invoke URL
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		// Switch to first frame set
		driver.findElement(By.cssSelector("a[href*='/nested']")).click();
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame(0);
		
		// Switch to Middle frame
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		
		// Print the text
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		
		
		

	}

}
