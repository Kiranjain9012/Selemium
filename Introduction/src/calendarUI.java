import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();

		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();

		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Sep"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("td[class='day']"));

		int count1 = dates.size();

		for (int i = 0; i < count1; i++) {

			String text = driver.findElements(By.cssSelector("td[class='day']")).get(i).getText();

			if (text.equalsIgnoreCase("24")) {

				driver.findElements(By.cssSelector("td[class='day']")).get(i).click();
				break;
			}
		}

	}

}
