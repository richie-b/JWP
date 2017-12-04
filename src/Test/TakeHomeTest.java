package Test;


import Nav.DashboardPageNav;
import Nav.LoginPageNav;
import Nav.SetupPageNav;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TakeHomeTest {
	
	private WebDriver driver;

	
	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Precision\\Documents\\Repos\\jwPlayer\\bin\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dashboard.jwplayer.com/");
	}
	
	
	
	@Test(priority = 1)
	public void takeHomeTest(){
		LoginPageNav login = new LoginPageNav(driver);
		DashboardPageNav dash = new DashboardPageNav(driver);
		SetupPageNav setup = new SetupPageNav(driver);
		String playerData = "";
		String currentPlayerName = "16:9 example player";
		String newPlayerName = "Test Player 1";
		String newAspectRatio = "4:3";
		String actualPlayerName;
		String actualRatio;
		
		login.signInUser("richellison@verizon.net", "Pass1word");
		dash.clickPlayersLink();
		dash.clickUserPlayerLink(currentPlayerName);
		setup.setPlayerName(newPlayerName);
		setup.setAspectRatio(newAspectRatio);
		setup.clickSaveButton();		
		setup.clickCloseButton();		
		playerData = dash.findPlayerData(newPlayerName);
		
		
		actualPlayerName = playerData.substring(0, newPlayerName.length());
		actualRatio = playerData.substring(newPlayerName.length() + 1, newAspectRatio.length() + newPlayerName.length() + 1);
		
		Assert.assertEquals(actualPlayerName, newPlayerName);
		Assert.assertEquals(actualRatio, newAspectRatio);
		
	}
	
	@AfterTest
	public void afterMethod() {
		driver.quit();
        //System.exit(0);
	}

}


