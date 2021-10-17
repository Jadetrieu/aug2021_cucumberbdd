package pageObject;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends Setup {

    public login_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Setup.driver = driver;
    }

    // locators
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;

    // Function
    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }
    public void enterPassword(String pass){
        passwordLocator.sendKeys(pass);
    }
}
