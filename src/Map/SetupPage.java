package Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetupPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public SetupPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}
	
	public WebElement getPlayerTitleElement() {
		WebElement playerTitle = driver.findElement(By.cssSelector("#player-name"));
		return playerTitle;
	}
	
	public WebElement getAspectRatioButtonElement() {
		WebElement aspectRatioButton = driver.findElement(By.cssSelector(".dropdown.jw-dropdown.ng-scope"));
		return aspectRatioButton;
	}
	
	public WebElement getAspectRatioElement(String ratio) {
		WebElement aspectRatio = driver.findElement(By.xpath("//a[text()='" + ratio + "']"));
		return aspectRatio;
	}
	
	public WebElement getSaveButtonElement() {
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(@type, 'submit')]"));
		return saveButton;
	}
	
	public WebElement getCloseButtonElement() {
		WebElement closeButton = driver.findElement(By.cssSelector(".button.button-med.button-secondary"));
		return closeButton;
	}
	
	public String getSaveButtonState() {
		WebElement saveButtonState = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@disabled, 'disabled')]")));
		return saveButtonState.getAttribute("disabled");		
	}

}
