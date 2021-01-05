import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kiran\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("kiranjain");
//		driver.findElement(By.name("pass")).sendKeys("password");
//		//driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		
//  Find element by custom xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Email");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password");
//		driver.findElement(By.xpath("//*[@value='Log In']")).click();
//		driver.close();
		
	//  Find element by custom cssSelector
			driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Email");
			driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Password");
			driver.findElement(By.cssSelector("[value='Log In']")).click();
		
	}

}
