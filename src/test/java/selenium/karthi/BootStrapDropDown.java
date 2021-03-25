package selenium.karthi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().
		driver.manage().window().maximize();
		(driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']//a"))).set
		
		List<WebElement> proTypes = driver.findElements(By. xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println(proTypes.size());
		proTypes.set
		
		for(WebElement ptype:proTypes) {
			
			if(ptype.getText().equalsIgnoreCase("Accounts")) {
				ptype.click();
				break;
			}
		}
			
	}

}
