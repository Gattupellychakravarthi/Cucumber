package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;

	@Given("launch Browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("enter url")
	public void enter_url() {
		driver.get("http://localhost:8888");

	}

	@When("enter user name")
	public void enter_user_name() {
		driver.findElement(By.name("user_name")).sendKeys("admin");

	}

	@When("enter password")
	public void enter_password() {
		driver.findElement(By.name("user_password")).sendKeys("123456");
	}

	@Then("click on login")
	public void click_on_login() {
		driver.findElement(By.id("submitButton")).click();

	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

	@When("enter url {string}")
	public void enter_url(String url) {
		driver.get(url);
	}

	@When("enter user name {string}")
	public void enter_user_name(String un) {
		driver.findElement(By.name("user_name")).sendKeys(un);
	}

	@When("enter password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}

}
