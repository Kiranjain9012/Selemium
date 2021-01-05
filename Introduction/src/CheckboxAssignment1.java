import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement check = driver.findElement(By.id("checkBoxOption1"));
		
		//Select the checkbox and validate
		check.click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//Unselect the checkbox and validate
		check.click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//Get Count of Checkbox
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.close();
	}

}
