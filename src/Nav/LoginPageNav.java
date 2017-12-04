package Nav;

import Map.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNav {
	
	private LoginPage pg; 
	public LoginPageNav(WebDriver driver) {
		pg = new LoginPage(driver);
	}
	
	public void setEmail(String item) {
		WebElement emailBox = pg.getEmailElement();
		emailBox.sendKeys(item);			
	}
	
	public void setPassword(String item) {
		WebElement password = pg.getPasswordElement();
		password.sendKeys(item);
	}
	
	public void clickSignIn() {
		WebElement signInButton = pg.getSignInButtonElement();
		signInButton.click();
	}
	
	public void signInUser(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickSignIn();
	}

}
