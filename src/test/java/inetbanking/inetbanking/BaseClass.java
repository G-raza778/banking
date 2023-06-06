package inetbanking.inetbanking;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL="https://demo.guru99.com/v4/";
	public String username="mngr164225";
	public String password="jahetAp";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","");
	}
}
