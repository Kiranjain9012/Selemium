import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys("Ind");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']"))
				.getAttribute("value"));

		
		
		// Using JSExecutor

		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // URL in the browser

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Rus");
		Thread.sleep(2000);
		String script = "return document.getElementById(\"autocomplete\").value;";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = (String) js.executeScript(script);
		System.out.println(text);
		String place = "Russian Federation";
		int i = 0;
		while (!text.equalsIgnoreCase(place)) {
			i++;
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}
	}

}
