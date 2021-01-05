import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class eKartPurchase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Declare Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, 5);

		// Implicit Wait
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Declare an array for items needed
		String[] productneeded = { "Cucumber", "Brocolli", "Beetroot" };

		// Open the web-site and maximize the window
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		addItems(driver, productneeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		// Explicit Wait usage
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] productneeded) {
		int j = 0;
		List<WebElement> productname = driver.findElements(By.cssSelector(".product-name"));

		for (int i = 0; i < productname.size(); i++) {
			String[] name = productname.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List<String> list = Arrays.asList(productneeded);

			if (list.contains(formattedName)) {
				j++;
				driver.findElements(By.cssSelector(".product-action")).get(i).click();
				if (j == productneeded.length)
					break;
			}
		}
	}

}
