package stepDef;

import Base.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObject.signup_page;

public class signup_step extends Setup {

    signup_page sp = new signup_page(driver);
    Faker faker = new Faker();

    @And("I enter valid student information")
    public void iEnterValidStudentInformation() {
        sp.enterFirstName(faker.name().firstName());
        sp.enterLastName(faker.name().lastName());
        sp.enterEmail(faker.internet().safeEmailAddress());
        sp.enterPassword("Test12345");
        sp.enterConfirmPassword("Test12345");
        // HW - COMPLETE THE Signup FORM AND SIGN UP FOR AN USER AND ASSERT "Thank you for sign up" message
        // Find out the list of radio button and select the 2nd radio button
        // select the first radio by using label
    }

    @When("I click on Create my account button")
    public void iClickOnCreateMyAccountButton() {
    }
}
