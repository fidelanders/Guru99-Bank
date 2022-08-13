//Guru99 Bank Project

package guru99bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyBank {

	@Test
	public static void logintest() {

//		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		DayOne(driver);
		DayTwo(driver);
	}

	// Day One
	private static void DayOne(WebDriver driver) {
		// Step 1: Open the website
		String baseUrl = "https://demo.guru99.com/V4";
		driver.get(baseUrl);

		String user = "mngr431338";
		String pass = "urapyzE";

		// Enter the email Id
		WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
		username.sendKeys(user);

		// Enter the password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pass);

		// Click Login
		WebElement btnlogin = driver.findElement(By.xpath("//input[@type='submit']"));
		btnlogin.click();

	}

	// Day Two
	private static void DayTwo(WebDriver driver) {
		// Validate landing page
		String expectedPage = "https://demo.guru99.com/V4/manager/Managerhomepage.php";
		String actualPage = driver.getCurrentUrl();
		Assert.assertEquals(expectedPage, actualPage, "The landing Page is not correct");
		System.out.println("The expected Page is correct");

		// Close Browser
		driver.close();
	}

}
