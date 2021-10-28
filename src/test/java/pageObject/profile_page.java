package pageObject;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class profile_page extends Setup {

    public profile_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Setup.driver = driver;
    }

    // locators
    @FindBy(how= How.XPATH, using = "//*[@id='profile_form']/legend")
    public WebElement welcomeMsg;

    // function
    public void verifyWelcomeToTalentTEKMsg(){
        String act = welcomeMsg.getText(); // Welcome to TalentTek
        String exp = "Welcome 2 TalentTek";
        Assert.assertEquals(act, exp);
    }
}
