import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// Get count of frames in the window and switch using index
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);

		// Switch to Frame using webElement
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		// driver.findElement(By.xpath("//div[@id='draggable']")).click();

		// Using action class to Drag and Drop
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();

		// Switch back to default window
		driver.switchTo().defaultContent();

	}

}
