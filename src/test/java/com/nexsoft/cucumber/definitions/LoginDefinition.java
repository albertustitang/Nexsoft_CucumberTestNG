package com.nexsoft.cucumber.definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.nexsoft.cucumber.pom.HomePage;
import com.nexsoft.cucumber.pom.SignInPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {

	protected WebDriver driver;
	protected HomePage home;
	protected SignInPage signIn;

	@Before
	public void init() {
		System.setProperty("url", "http://localhost/cicool");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(System.getProperty("url"));
		
	}

	@Given("User berada di halaman Login Account")
	public void gotoLogin() throws Throwable {
		driver.get(System.getProperty("url"));
		home = PageFactory.initElements(driver, HomePage.class);
		signIn = home.clickSignIn();
		System.out.println("User di Login Account");
	}

	@When("User memasukkan username")
	public void inputUsername() throws Throwable {
		System.out.println("memasukkan username");
		signIn.setEmail("albertustitang@gmail.com");
	}

	@And("User memasukkan password")
	public void inputPassword() throws Throwable {
		System.out.println("User memasukkan password");
		signIn.setPassword("@Yogyakarta99");
	}

	@And("User memasukkan password salah")
	public void inputWrongPassword() throws Throwable {
		System.out.println("User memasukkan password salah");
		signIn.setPassword("12331");
	}

	@And("User menekan tombol login")
	public void clickButton() throws Throwable {
		System.out.println("User menekan tombol login");
		signIn.clickButton();
	}

	@Then("User dapat masuk ke dalam Dashboard")
	public void DashboardPage() throws Throwable {
		System.out.println("User dapat masuk ke dalam Dashboard");
	}

	@Then("User tidak dapat masuk ke dalam Dashboard")
	public void invalidPage() throws Throwable {
		System.out.println("User dapat masuk ke dalam Dashboard");
	}

}
