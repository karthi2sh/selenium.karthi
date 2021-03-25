package selenium.karthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankaka2\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://frontend.nopcommerce.com/");

		//chrome
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sankaka2\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://frontend.nopcommerce.com/");

		//chrome
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sankaka2\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver edriver = new EdgeDriver();
		edriver.get("https://frontend.nopcommerce.com/");*/

		//using webdriver manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://frontend.nopcommerce.com/");
		System.out.println(driver.getTitle());
	}

}
