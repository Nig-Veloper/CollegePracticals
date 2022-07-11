package gcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class test {
	
	static String driverPath = "D:\\sqa\\eselenium\\geckodriver.exe";
	
	public static void main(String[] args) {


	System.setProperty("webdriver.gecko.driver", driverPath);

	FirefoxProfile fp = new FirefoxProfile();
	fp.setPreference(FirefoxProfile.PORT_PREFERENCE, "7055");

	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(fp);

	WebDriver driver=new FirefoxDriver(options);   

	driver.get("http://localhost:1234/index.html");

	driver.manage().window().maximize();
	driver.findElement(By.name("n1")).sendKeys("36");
	driver.findElement(By.name("n2")).sendKeys("6");
	driver.findElement(By.name("btn")).click();

	String result=driver.findElement(By.name("result")).getAttribute("name=result");
	System.out.println("GCD="+result);

	}

}
