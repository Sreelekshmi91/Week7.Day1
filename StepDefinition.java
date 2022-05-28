package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public ChromeDriver driver;

	@Given("Open the chrome browser")
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Load the application URL")
	public void loadApplication() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void verifiyHomepage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}
	}
}