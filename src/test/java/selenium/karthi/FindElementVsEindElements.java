package selenium.karthi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsEindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//findelement
		
		//WebElement e = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement e = driver.findElement(By.id("small-searchterms"));
		e.sendKeys("xyz");
		List<WebElement> links = driver.findElements(By.xpath("//div[contains(classname,'footer-upper')]//strong"));
		System.out.println(links.size());
		List<WebElement> search = driver.findElements(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(search.size());
		
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		
		
	}

}
