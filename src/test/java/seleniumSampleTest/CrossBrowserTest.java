package seleniumSampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Chrome Browser
		 * System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); WebDriver
		 * driver = new ChromeDriver();
		 */
		
		/* Edge Browser
		 * System.setProperty("webdriver.edge.driver", "msedgedriver.exe"); WebDriver
		 * driver = new EdgeDriver();
		 */
		
		// Firefox Browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("demo");
		driver.findElement(By.name("inputPassword")).sendKeys("Password@123");
		driver.findElement(By.className("submit")).click();

	}

}
