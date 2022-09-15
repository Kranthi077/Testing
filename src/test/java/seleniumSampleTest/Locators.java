package seleniumSampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// this class is about selenium locators

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		//LinkText
		//d.findElement(By.linkText("Careers")).click();
		//Partial Link Text
		//d.findElement(By.linkText("Sell under Amazon Accelerator")).click();
		d.findElement(By.partialLinkText("Sell under Amazon")).click();

		
		/*
		 * d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		 * d.findElement(By.id("nav-search-submit-button")).click();
		 * d.findElement(By.className("nav_first")).click();
		 * d.get("https://www.facebook.com/");
		 * d.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		 * Thread.sleep(3000);
		 * d.findElement(By.name("firstname")).sendKeys("Firstname");
		 */
		d.close();

	}

}
