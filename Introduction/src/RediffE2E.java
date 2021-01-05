import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
//		custom xpath/cssSelector using Regular expression
		driver.findElement(By.cssSelector("a[title*='user? Sign']")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("Email");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("password");
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		

	}

}
