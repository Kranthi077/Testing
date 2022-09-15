package seleniumSampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']")).click();
		//d.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_bestsellers\"]")).click();
		d.findElement(By.xpath("(//div[@role=\"treeitem\"])[3]")).click();
		d.close();
	}

}
