package projectreact.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import projectreact.pages.Careers;
import projectreact.pages.HomePage;
import projectreact.pages.CareersSA;

public class MyStepdefs {
    @Steps
    HomePage homePage;
    Careers careers;
    CareersSA careersSA;

    @Given(": User launch the iLab website")
    public void userLaunchTheILabWebsite()
    {
        homePage.navigate_to_home();
    }


    @Then(": User must be on the home page")
    public void userMustBeOnTheHomePage()
    {
        homePage.i_am_on_homePage();
    }

    @And(": User clicks on careers link")
    public void userClicksOnCareersLink()
    {
        homePage.click_careers_link();
    }

    @And(": User clicks on South Africa link")
    public void userClicksOnSouthAfricaLink()
    {
        careers.click_sa_link();
    }

    @And(": Selects the first opening on the list")
    public void selectsTheFirstOpeningOnTheList()
    {
        careersSA.check_location();
        careersSA.open_job_opening();
    }

    @And(": clicks apply online")
    public void clicksApplyOnline()
    {
        careersSA.click_apply_online();
    }

    @And(": fills out the form and enters (.*) and (.*)")
    public void fillsOutTheFormAndEntersNameAndEmail(String name, String email)
    {
        careersSA.fill_in_form(name, email);
    }

    @And(": clicks send button application")
    public void clicksSendButtonApplication()
    {
        careersSA.click_send_app_btn();
    }

    @Then(": Error message must be displayed")
    public void errorMessageMustBeDisplayed()
    {
        careersSA.error_message_isDisplayed();
    }


}
