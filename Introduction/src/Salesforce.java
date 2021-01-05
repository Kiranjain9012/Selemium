import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Email");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		driver.close();
		
	}

}
