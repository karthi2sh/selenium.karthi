package selenium.karthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		WebElement e = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		WebElement mRadio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement fRadio = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(mRadio.isSelected());
		System.out.println(fRadio.isSelected());
		
		mRadio.click();
		System.out.println(mRadio.isSelected());
		System.out.println(fRadio.isSelected());
		
		fRadio.click();
		System.out.println(mRadio.isSelected());
		System.out.println(fRadio.isSelected());
		
		
	}

}
