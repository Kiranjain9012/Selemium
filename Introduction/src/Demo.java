import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// invoke .exe driver file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");
		// Create Driver Object for Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com"); // Hit Url on the browser
		System.out.println(driver.getTitle()); // Get the title of the page
		System.out.println(driver.getCurrentUrl()); // get the current url of the page
		// System.out.println(driver.getPageSource()); //get the page source

		driver.navigate().to("http://yahoo.com");
//		driver.navigate().back(); //navigate back 
//		driver.navigate().forward(); // navigate forward
		driver.close(); // Closes current browser
		// driver.quit(); // Closes all the browsers opened by the Selenium scripts

	}

}
