package com.SeleniumPracticeTask19.org;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.guvi.in/register");

		// Locators for Full Name Field

		// Locator taken ByID

		WebElement fullNameById = driver.findElement(By.id("name"));
		fullNameById.sendKeys("surendhar");
		fullNameById.clear();

		// Locator taken by XPath passing index
		WebElement indexFullNameXPath = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		indexFullNameXPath.sendKeys("surendhar");
		indexFullNameXPath.clear();

		// Locator taken by using following sibling and tag name type is class
		WebElement classFollowingSiblingFNameXPath = driver.findElement(
				By.xpath("//label[contains(text(),'Full Name')]/following-sibling::input[@class='form-control']"));
		classFollowingSiblingFNameXPath.sendKeys("surendhar");
		classFollowingSiblingFNameXPath.clear();

		// Locator taken by using following sibling and tag name type is id
		WebElement idFollowingSiblingFNameXPath = driver
				.findElement(By.xpath("//label[contains(text(),'Full Name')]/following-sibling::input[@id='name']"));
		idFollowingSiblingFNameXPath.sendKeys("surendhar");
		idFollowingSiblingFNameXPath.clear();

		// Locator taken by using preceding sibling and tag name type is class
		WebElement classPrecedingSiblingFNameXPath = driver.findElement(
				By.xpath("//small[@class='certificates']/preceding-sibling::input[@class='form-control']"));
		classPrecedingSiblingFNameXPath.sendKeys("surendhar");
		classPrecedingSiblingFNameXPath.clear();

		// Locator taken by using preceding sibling and tag name type is id
		WebElement idPrecedingSiblingFNameXPath = driver
				.findElement(By.xpath("//small[@class='certificates']/preceding-sibling::input[@id='name']"));
		idPrecedingSiblingFNameXPath.sendKeys("surendhar");
		idPrecedingSiblingFNameXPath.clear();

		// Locator taken "From Password Field to Name Field" by using preceding and tag
		// name type is id
		WebElement idPrecedingNameXPath = driver
				.findElement(By.xpath("//input[@type='password']/preceding::input[@id='name']"));
		idPrecedingNameXPath.sendKeys("surendhar");
		idPrecedingNameXPath.clear();

		System.out.println("Name Field Register Was Successfully Completed");

		// Locators for Email Address Field

		// Locator taken ByID
		WebElement emailById = driver.findElement(By.id("email"));
		emailById.sendKeys("surendharpalaniswamy@gmail.com");
		emailById.clear();

		// Locator taken by using XPath and tag name type is type
		WebElement emailTypeXPath = driver.findElement(By.xpath("//input[@type='email']"));
		emailTypeXPath.sendKeys("surendharpalaniswamy@gmail.com");
		emailTypeXPath.clear();

		// Locator taken by using XPath and tag name types are id and type and its
		// divided
		// by "Or"
		WebElement emailOrXPath = driver.findElement(By.xpath("//input[@id='emaill' or @type='email']"));
		emailOrXPath.sendKeys("surendharpalaniswamy@gmail.com");
		emailOrXPath.clear();

		// Locator taken by using XPath and tag name types are type and id and its
		// divided
		// by "And"
		WebElement emailAndXPath = driver.findElement(By.xpath("//input[@type='email' and @id='email']"));
		emailAndXPath.sendKeys("surendharpalaniswamy@gmail.com");
		emailAndXPath.clear();

		// Locator taken by using following sibling and tag name type is type
		WebElement typeFollowingSiblingEmailXPath = driver
				.findElement(By.xpath("//label[@for='email']/following-sibling::input[@type='email']"));
		typeFollowingSiblingEmailXPath.sendKeys("surendharpalaniswamy@gmail.com");
		typeFollowingSiblingEmailXPath.clear();

		// Locator taken by using following sibling and tag name type is id
		WebElement idFollowingSiblingEmailXPath = driver
				.findElement(By.xpath("//label[@for='email']/following-sibling::input[@id='email']"));
		idFollowingSiblingEmailXPath.sendKeys("surendharpalaniswamy@gmail.com");
		idFollowingSiblingEmailXPath.clear();

		// Locator taken "From Password Field to Email Field" by using preceding tag
		// name type is type
		WebElement typePrecedingEmailXPath = driver
				.findElement(By.xpath("//input[@type='password']/preceding::input[@type='email']"));
		typePrecedingEmailXPath.sendKeys("surendharpalaniswamy@gmail.com");
		typePrecedingEmailXPath.clear();

		// Verification message for our confirmation
		System.out.println("Email Field Register Was Successfully Completed");

		// Locators for Password Field

		// Locator taken by using XPath and tag name type is type
		WebElement passwordTypeXPath = driver.findElement(By.xpath("//input[@type='password']"));
		passwordTypeXPath.sendKeys("Guvi@987");
		passwordTypeXPath.clear();

		// Locator taken by using XPath and tag name type is id
		WebElement passwordIdXPath = driver.findElement(By.xpath("//input[@id='password']"));
		passwordIdXPath.sendKeys("Guvi@987");
		passwordIdXPath.clear();

		// Locator taken by using XPath and tag name type is class
		WebElement passwordClassXPath = driver.findElement(By.xpath("//input[@class='form-control password-err']"));
		passwordClassXPath.sendKeys("Guvi@987");
		passwordClassXPath.clear();

		// Locator taken by using following sibling and tag name type is type
		WebElement typeFollowingSiblingPasswordXPath = driver
				.findElement(By.xpath("//label[text()='Password']/following-sibling::input[@type='password']"));
		typeFollowingSiblingPasswordXPath.sendKeys("Guvi@987");
		typeFollowingSiblingPasswordXPath.clear();

		// Locator taken by using following sibling and tag name type is id
		WebElement idFollowingSiblingPasswordXPath = driver
				.findElement(By.xpath("//label[text()='Password']/following-sibling::input[@id='password']"));
		idFollowingSiblingPasswordXPath.sendKeys("Guvi@987");
		idFollowingSiblingPasswordXPath.clear();

		// Locator taken by using following sibling and tag name type is class
		WebElement classFollowingSiblingPasswordXPath = driver.findElement(
				By.xpath("//label[text()='Password']/following-sibling::input[@class='form-control password-err']"));
		classFollowingSiblingPasswordXPath.sendKeys("Guvi@987");
		classFollowingSiblingPasswordXPath.clear();

		// Verification message for our confirmation
		System.out.println("Password Field Register Was Successfully Completed");

		// Locator taken by using ByXPath and tag name type is class
		WebElement phoneNumberTypeClassXPath = driver
				.findElement(By.xpath("//input[@class='form-control countrycode-left']"));
		phoneNumberTypeClassXPath.sendKeys("321456987");
		phoneNumberTypeClassXPath.clear();

		// Locator taken by using ByXPath and tag name type is id
		WebElement phoneNumberTypeIdXPath = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		phoneNumberTypeIdXPath.sendKeys("321456987");
		phoneNumberTypeIdXPath.clear();

		// Locator taken by using following and tag name type is id
		WebElement phoneNumberFollowingTypeIdXPath = driver
				.findElement(By.xpath("//label[text()='Mobile number']/following::input[@id='mobileNumber']"));
		phoneNumberFollowingTypeIdXPath.sendKeys("321456987");
		phoneNumberFollowingTypeIdXPath.clear();

		// Locator taken by using following and tag name type is class
		WebElement phoneNumberFollowingTypeClassXPath = driver.findElement(
				By.xpath("//label[text()='Mobile number']/following::input[@class='form-control countrycode-left']"));
		phoneNumberFollowingTypeClassXPath.sendKeys("321456987");
		phoneNumberFollowingTypeClassXPath.clear();

		// Verification message for our confirmation
		System.out.println("PhoneNumber Field Register Was Successfully Completed");

		// Locator taken by using XPath and tag name type is id

		WebElement idSignUpButtonXPath = driver.findElement(By.xpath("//a[@id='signup-btn']"));
		idSignUpButtonXPath.click();

		// Locator taken by using XPath and tag name type is class
		WebElement classSignUpButtonXPath = driver.findElement(By.xpath("//a[@class='btn signup-btn']"));
		classSignUpButtonXPath.click();

		// Locator taken by using text XPath
		WebElement textSignUpButtonXPath = driver.findElement(By.xpath("(//a[text()='Sign Up'])[1]"));
		textSignUpButtonXPath.click();

		// Verification message for our confirmation
		System.out.println("SignUp Field Was Successfully Submitted");

		// Wait for 2 seconds and close the browser
		Thread.sleep(2000);
		driver.quit();
	}

}
