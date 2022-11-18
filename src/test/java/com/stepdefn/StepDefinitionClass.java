package com.stepdefn;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefinitionClass {

	WebDriver driver;
	
	
	@Given("User should launch the Browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User should login {string} and {string}")
	public void login(String username, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(username);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User should search hotels {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void searchHotel(String location, String hotels, String room_type, String room_nos, String datepick_in, String datepick_out, String adult_room, String child_room) {
		
		
		WebElement selectlocation = driver.findElement(By.id("location"));
		Select s=new Select (selectlocation);
		s.selectByValue(location);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select (hotel);
		s1.selectByValue(hotels);
		
		WebElement roomType1= driver.findElement(By.id("room_type"));
		Select s2=new Select (roomType1);
		s2.selectByValue(room_type);
		
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s3=new Select (roomnos);
		s3.selectByValue(room_nos);
		
		WebElement ChckIn = driver.findElement(By.id("datepick_in"));
		ChckIn.sendKeys(datepick_in);
		
		WebElement ChckOut = driver.findElement(By.id("datepick_out"));
		ChckOut.sendKeys(datepick_out);
		
		WebElement adRoom = driver.findElement(By.id("adult_room"));
		Select s6=new Select (adRoom);
		s6.selectByValue(adult_room);
		
		WebElement chRoom = driver.findElement(By.id("child_room"));
		Select s7=new Select (chRoom);
		s7.selectByValue(child_room);
		
		WebElement btnLogin1 = driver.findElement(By.name("Submit"));
		btnLogin1.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User should select hotel Select")
	public void selectHotel() {
		WebElement btnLogin11 = driver.findElement(By.name("radiobutton_0"));
		btnLogin11.click();
		WebElement btnLogin111 = driver.findElement(By.name("continue"));
		btnLogin111.click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User should book hotel {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void bookHotel(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String selectMonth, String selectYear, String cc_cvv) {
		WebElement firstName1 = driver.findElement(By.id("first_name"));
		firstName1.sendKeys(firstName);
		WebElement lastName1 = driver.findElement(By.id("last_name"));
		lastName1.sendKeys(lastName);
		WebElement addr = driver.findElement(By.id("address"));
		addr.sendKeys(billingAddress);
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		ccnum.sendKeys(creditCardNo);
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s7=new Select (ccType);
		s7.selectByValue(creditCardType);
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select s8=new Select (expMonth);
		s8.selectByValue(selectMonth);
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select s9=new Select (expYear);
		s9.selectByValue(selectYear);
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys(cc_cvv);
		WebElement bookNow = driver.findElement(By.name("book_now"));
		bookNow.click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Then("User should get order id after booking")
	public void orderId() {
		WebElement order = driver.findElement(By.id("order_no"));
		String value = order.getAttribute("value");
		System.out.println(value);
	
	
	}
	
}


	
	
	
	
	



