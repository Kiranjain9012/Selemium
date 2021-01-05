import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class dropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Static DropDown
		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.linkText("REGISTER")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s.selectByValue("7");
		s.selectByVisibleText("ARGENTINA");
		s.selectByIndex(9);

		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).click();

//		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		s.selectByIndex(3);
//		s.selectByValue("6");
//		s.selectByVisibleText("2");

	}

}
