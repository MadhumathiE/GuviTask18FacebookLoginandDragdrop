package facebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement creataccbutton = driver.findElement(By.linkText("Create new account"));
		creataccbutton.click();
		Thread.sleep(1500);
		WebElement firstNameInput = driver.findElement(By.name("firstname"));
        firstNameInput.sendKeys("Test");
		WebElement lastNameInput = driver.findElement(By.name("lastname"));
		lastNameInput.sendKeys("User");
		WebElement mobnumInput = driver.findElement(By.name("reg_email__"));
		mobnumInput.sendKeys("7353888398");
		WebElement passwordInput = driver.findElement(By.name("reg_passwd__"));
        passwordInput.sendKeys("YourStrongPassword");

        WebElement monthDropdown = driver.findElement(By.name("birthday_month"));
        monthDropdown.sendKeys("May");

        WebElement yearDropdown = driver.findElement(By.name("birthday_year"));
        yearDropdown.sendKeys("1985");

        WebElement genderRadioButton = driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
        genderRadioButton.click();
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();
        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {
            System.out.println("Successfully registered and redirected to Facebook homepage.");
        } else {
            System.out.println("Registration failed or redirection failed.");
        }
		
	}}



		


	


