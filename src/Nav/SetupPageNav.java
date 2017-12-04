package Nav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Map.SetupPage;

public class SetupPageNav {
	
private SetupPage pg;
	
	public SetupPageNav(WebDriver driver) {
		pg = new SetupPage(driver);
	}
	
	public void setPlayerName(String title) {
		WebElement playerName = pg.getPlayerTitleElement();
		playerName.clear();
		playerName.sendKeys(title);
	}
	
	public void clickAspectRatioButton() {
		WebElement aspectRatioButton = pg.getAspectRatioButtonElement();
		aspectRatioButton.click();
	}
	
	public void setAspectRatio(String ratio) {
		this.clickAspectRatioButton();
		WebElement aspectRatio = pg.getAspectRatioElement(ratio);
		aspectRatio.click();
	}
	
	public void clickSaveButton() {
		WebElement saveButton = pg.getSaveButtonElement();
		saveButton.click();
	}
	
	public void clickCloseButton() {
		WebElement closeButton = pg.getCloseButtonElement();
		String closeState = pg.getSaveButtonState();
		if(closeState.equals("true")) {
			closeButton.click();
		}
	}
	


}
