package Map;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}
	
	public WebElement getPlayersLinkElement() {
		WebElement playersLink = driver.findElement(By.xpath("//a[text()='players']"));
		return playersLink;
	}
	
	public WebElement getUserPlayer(String playerName) {
		WebElement userPlayerLink = driver.findElement(By.xpath("//a[contains(@title, '" + playerName + "')]"));
		return userPlayerLink;
	}
	
	public List <WebElement> getPlayersTableRows() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("tr")));
		List <WebElement> tableRows = driver.findElements(By.tagName("tr")); 
		return tableRows;					
	}

	
	
}
