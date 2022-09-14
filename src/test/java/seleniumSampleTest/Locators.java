package seleniumSampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// this class is about selenium locators

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		d.findElement(By.id("nav-search-submit-button")).click();
		d.findElement(By.className("nav_first")).click();

		
		
		// d.close();

	}

}
