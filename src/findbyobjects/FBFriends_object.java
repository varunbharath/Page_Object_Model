package findbyobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBFriends_object {
	@FindBy(xpath = "//span[text()='Friends']")
	public static WebElement clickFriend;
	@FindBy(xpath = "//input[@placeholder='Search Facebook']")
	public static WebElement searchbox;
	@FindBy (xpath = "//*[@mask='url(#:R3arcdad5qq9papd5aq:)']")
	public static WebElement logoutimage;
	@FindBy (xpath = "//span[@id=':rqn:']")
	public static WebElement clicklogout;
	
	

}
