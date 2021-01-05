import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

		// Index Xpath
//		driver.findElement(By.cssSelector("(a[value='MAA'])[2]"));

		// Parent Child Xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		// Current Date Selection
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// Check if Return Date disabled
		if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5")) {
			System.out.println("Disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Enabled");
			Assert.assertTrue(false);
		}

		// Click of checkbox and check if selected
		WebElement check = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		check.click();
		Assert.assertTrue(check.isSelected());

		// Select Passengers
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select passengers = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		passengers.selectByValue("3");

		// Select 3 and validate the passengers selected
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Select Currency
		Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByVisibleText("USD");

		// Click on Search
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();

		System.out.println(driver.switchTo().alert().getText());

		// Alert handling
		driver.switchTo().alert().accept();
		driver.switchTo().alert().

		// Select Passengers
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
//		Select passengers1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		passengers.selectByValue("4");

		// Select 4 and validate the passengers selected
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Click on Search
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();

	}

}
