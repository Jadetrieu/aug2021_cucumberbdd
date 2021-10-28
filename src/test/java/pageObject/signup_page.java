package pageObject;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signup_page extends Setup {

    public signup_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Setup.driver = driver;
    }
    //locators
    @FindBy(how= How.NAME, using = "firstName")
    public WebElement firstName;
    @FindBy(how= How.NAME, using = "lastName")
    public WebElement lastName;
    @FindBy(how= How.NAME, using = "email")
    public WebElement email;
    @FindBy(how= How.NAME, using = "password")
    public WebElement password;
    @FindBy(how= How.NAME, using = "confirmPassword")
    public WebElement confirmPassword;

    // functions
    public void enterFirstName(String firstNameValue){
        firstName.sendKeys(firstNameValue);
    }
    public void enterLastName(String lastNameValue){
        lastName.sendKeys(lastNameValue);
    }
    public void enterEmail(String emailValue){
        email.sendKeys(emailValue);
    }
    public void enterPassword(String passwordValue){
        password.sendKeys(passwordValue);
    }
    public void enterConfirmPassword(String confirmPasswordValue){
        confirmPassword.sendKeys(confirmPasswordValue);
    }
}
