package selenium.karthi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttributeValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login/");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		
		email.sendKeys(Keys.ENTER);
		
		
	}

}
