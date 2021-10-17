package pageObject;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class signup_page extends Setup {

    public signup_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Setup.driver = driver;
    }

}
