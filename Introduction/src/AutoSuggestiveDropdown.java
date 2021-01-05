import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Open the website and maximize the window
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		//Select source 
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ENTER);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("MUM");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		//Select Destination
		driver.findElement(By.id("toCity")).sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("BAN");
		
		for(int i=0; i<2; i++)
		{
			
			to.sendKeys(Keys.ARROW_DOWN);
		}
		
		to.sendKeys(Keys.ENTER);
		
		
		
	}

}
