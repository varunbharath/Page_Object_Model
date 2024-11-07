package pom_testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import findbyobjects.FBFriends_object;
import findbyobjects.FB_login_objects;
import findbyobjects.Signup_Page_objects;

public class FB_SignUP_POM {
	WebDriver driver;
	Actions act3;
	
	JavascriptExecutor JS5;
	@Test
	public void  signup() throws InterruptedException {
		driver=new ChromeDriver();
		act3= new Actions(driver);
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","");
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		//driver.get("https://www.facebook.com");
PageFactory.initElements(driver,Signup_Page_objects.class);
		Signup_Page_objects.FirstName.sendKeys("Varun");
		Signup_Page_objects.lastname.sendKeys("B");
	Signup_Page_objects.email.sendKeys("1234567@gmail.com");
	Signup_Page_objects.confirmationemail.sendKeys("1234567@gmail.com");
		Signup_Page_objects.password.sendKeys("123456@@wertE"); 
		
PageFactory.initElements(driver,FB_Tc_Login.class);
		
		FB_login_objects.username.sendKeys("8220113955");
		FB_login_objects.loginPassword.sendKeys("Coimbatore@2020");
		FB_login_objects.loginbutton.click();
		Thread.sleep(20000);
		

		PageFactory.initElements(driver, FBFriends_object.class);
		
		FBFriends_object.clickFriend.click();
		FBFriends_object.searchbox.sendKeys("Santhosh");
		FBFriends_object.searchbox.click();
		FBFriends_object.logoutimage.click();
		FBFriends_object.clicklogout.click();

	}

}
