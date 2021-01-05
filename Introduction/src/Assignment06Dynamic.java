import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment06Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("checkBoxOption1")).click();
		String text = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(text);

		Select drop = new Select(driver.findElement(By.id("dropdown-class-example")));
		drop.selectByVisibleText(text);

		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(text);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		String alertText = driver.switchTo().alert().getText();

		if (alertText.contains(text)) {
			System.out.println("Present");
		} else {
			System.out.println("Not present");
		}

		driver.close();

	}

}
