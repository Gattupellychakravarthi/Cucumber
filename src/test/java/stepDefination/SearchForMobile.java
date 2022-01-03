package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchForMobile {
	WebDriver driver;
	@Given("Launch the Browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("Enter URL")
	public void enter_url() {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	}

	@Then("Wait for page Loading")
	public void wait_for_page_loading() {

	}

	@Then("Search for apple mobiles")
	public void search_for_apple_mobiles() {
		driver.findElement(By.name("q")).sendKeys("apple mobile");

	}

	@Then("Search for {string}")
	public void search_for(String TV) {
		driver.findElement(By.name("q")).sendKeys(TV);

	}

	@Then("Close the Browser")
	public void close_the_browser_f() {
		driver.close();

	}

}
