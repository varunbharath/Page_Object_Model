package findbyobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Signup_Page_objects {
	
	
	@FindBy(name="firstname" )
	
	public static WebElement FirstName;
	
	@FindBy (name="lastname")
	public static WebElement lastname;
	@FindBy (name="reg_email__")
	public static WebElement email;
	@FindBy (name="reg_email_confirmation__")
	public static WebElement confirmationemail;
	@FindBy (id="password_step_input")
	public static WebElement password;
	@FindBy(name="birthday_day")
	public static WebElement day;
	@FindBy(id="month")
	public static WebElement month;
	@FindBy(id="year")
	public static WebElement year;
	@FindBy(xpath = "//label[text()='Male']")
	public static WebElement gender;
	
	

}
