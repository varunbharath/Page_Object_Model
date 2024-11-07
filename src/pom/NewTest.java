package pom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest {

	 public static WebElement email;
	 public static WebElement pass;
	 public static WebElement loginbutton;
	 public static WebElement u_0_0_Aq;//createnewaccount
	 public static WebElement firstname;
	 public static WebElement lastname;
	 public static WebElement reg_email__;
	 public static WebElement day;
	 public static WebElement month;
	 
	 
	 WebDriver driver=new ChromeDriver();
 SoftAssert as=new SoftAssert();
 Random ran=new Random();

  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
	//  System.setProperty(null, null);
	 // WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348092");
	 // PageFactory.initElements(NewTest.class, driver);
	 
	  PageFactory.initElements(driver,NewTest.class);
	  
	  email.sendKeys("1234");
	 //as.assertEquals("1234", "1222");
	  pass.sendKeys("werew");
	  org.testng.Assert.assertEquals("12324", "1224");
	  loginbutton.click();
	  //as.assertAll();
	  
  }
  @Test
  public void logoutscenario() {
	  
	  firstname.sendKeys("Rahul");
	  lastname.sendKeys("kishore");
	  reg_email__.sendKeys("123456@gmail.com");
	  Select select=new Select(day);
	  select.selectByVisibleText("18");
	  Select select1=new Select(month);
	  select1.deselectByVisibleText("");
  }
}
