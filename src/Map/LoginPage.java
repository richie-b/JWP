package Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}
	
	public WebElement getEmailElement() {
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
		return email;
	}
	
	public WebElement getPasswordElement() {
		WebElement password = driver.findElement(By.cssSelector("input[type=password]"));
		return password;
	}
	
	public WebElement getSignInButtonElement() {
		WebElement signInButton = driver.findElement(By.cssSelector("#submit_login"));
		return signInButton;
	}

}
