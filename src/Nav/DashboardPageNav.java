package Nav;

import Map.DashboardPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DashboardPageNav {
	
	private DashboardPage pg;
	
	public DashboardPageNav(WebDriver driver) {
		pg = new DashboardPage(driver);
	}
	
	public void clickPlayersLink() {
		WebElement playersLink = pg.getPlayersLinkElement();
		playersLink.click();			
	}
	
	public void clickUserPlayerLink(String playerName) {
		WebElement playerLink = pg.getUserPlayer(playerName);
		playerLink.click();			
	}
	
	public String findPlayerData(String playerName) {
		List <WebElement> playerData = pg.getPlayersTableRows();
		
		for (int i = 0; i < playerData.size(); i++) {
			if(playerData.get(i).getText().contains(playerName)) {
				 return playerData.get(i).getText();
			}            
        }
		
		return "Could not find player name in table";		
	}
	
	

}
