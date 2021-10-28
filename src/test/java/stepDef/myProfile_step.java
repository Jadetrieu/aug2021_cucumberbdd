package stepDef;

import Base.Setup;
import io.cucumber.java.en.Then;
import pageObject.profile_page;

public class myProfile_step extends Setup {

    profile_page pp = new profile_page(driver);

    @Then("I should be able to successfully log in")
        public void iShouldBeAbleToSuccessfullyLogIn() {
        pp.verifyWelcomeToTalentTEKMsg();
        }

    @Then("I should see Thank you for sign up message")
    public void iShouldSeeThankYouForSignUpMessage() {
    }
}

