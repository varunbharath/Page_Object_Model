package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FB_SignUp {
    
    WebDriver driver;
    public static WebElement firstname;
    public static WebElement lastname;
    public static WebElement reg_email__;
    public static WebElement reg_email_confirmation__;
    public static WebElement password_step_input;
    public static WebElement day;
    public static WebElement month;
    public static WebElement year;
    public static WebElement signUpButton;
    public static WebElement customGenderOption;
    
    Actions act1;
    JavascriptExecutor JS1;
    SoftAssert as;

  @BeforeMethod
    public void setupProcess() {
        System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
        
        PageFactory.initElements(driver, FB_SignUp.class);
        
        act1 = new Actions(driver);
        JS1 = (JavascriptExecutor) driver;
        as = new SoftAssert();
    }
    
    @Test 
    public void SignupforFB() {
        act1.sendKeys(firstname, "Ram").perform();
        act1.sendKeys(lastname, "Kumar").perform();
        act1.sendKeys(reg_email__, "122334655@gmail.com").perform();
        
        as.assertEquals(reg_email__.getAttribute("value"), "122334655@gmail.com", "Email does not match!");

        act1.sendKeys(reg_email_confirmation__, "122334655@gmail.com").perform();
        act1.sendKeys(password_step_input, "123456wertty@@").perform();
        
        Select sec = new Select(day);
        sec.selectByVisibleText("15");
        Select Sec1 = new Select(month);
        Sec1.selectByVisibleText("Oct");
        Select sec2 = new Select(year);
        sec2.selectByVisibleText("1990");
        
        JS1.executeScript("arguments[0].click()", customGenderOption);
        JS1.executeScript("arguments[0].click()", signUpButton);
        
        as.assertAll();
    }
    
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
