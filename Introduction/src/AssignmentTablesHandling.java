import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTablesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Get row count
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		int rowCount = table.findElements(By.tagName("tr")).size();
		System.out.println("Rows="+rowCount);
		
		//Get column count
		WebElement tableHeader = table.findElement(By.cssSelector("table[id='product'] tr:nth-child(1)"));
		int columnCount = tableHeader.findElements(By.tagName("th")).size();
		System.out.println("Columns="+ columnCount);
		
		//Get 2nd row data printed
		WebElement rowThird = table.findElement(By.cssSelector("table[id='product'] tr:nth-child(3)"));
		List<WebElement> rowData = rowThird.findElements(By.tagName("td"));
		System.out.println(rowData.get(0).getText());
		System.out.println(rowData.get(1).getText());
		System.out.println(rowData.get(2).getText());
		
		

	}

}
