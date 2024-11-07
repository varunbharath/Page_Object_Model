package pom_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import findbyobjects.FBFriends_object;
import findbyobjects.FB_login_objects;

public class FB_Friends  {
	WebDriver driver;
	
	public void  clickfriends() {
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		driver.get("https://www.facebook.com/login.php/");
		driver=new ChromeDriver();
		
		PageFactory.initElements(driver,FB_Tc_Login.class);
		
		FB_login_objects.username.sendKeys("8220113955");
		FB_login_objects.loginPassword.sendKeys("Coimbatore@2020");
		FB_login_objects.loginbutton.click();
		
		PageFactory.initElements(driver, FBFriends_object.class);
		
		FBFriends_object.clickFriend.click();
		FBFriends_object.searchbox.sendKeys("Santhosh");
		FBFriends_object.searchbox.click();
		FBFriends_object.logoutimage.click();
		FBFriends_object.clicklogout.click();
		
	}
	

}
