import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			String url = "http://automationpractice.com/index.php";
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		driver.quit();
	}
	

}
