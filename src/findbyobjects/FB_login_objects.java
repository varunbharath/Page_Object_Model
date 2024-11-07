package findbyobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class FB_login_objects {
	@FindBy(xpath="//input[@name='email']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@name='pass'] ")
	public static WebElement loginPassword;
	@FindBy(name="login")
	public static WebElement loginbutton;
	

}
