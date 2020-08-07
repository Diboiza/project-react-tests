package projectreact.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;
import projectreact.ReUsableSteps;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("page:home.page/careers/south-africa/")
public class CareersSA extends PageObject
{
    @Steps
    ReUsableSteps steps;

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/div[2]/span[2]/span")
    public WebElement location_tab;

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/div[1]/a")
    public WebElement first_job_opening_link;

    @FindBy(xpath = "/html/body/section[2]/div[2]/div/div/div/div/div[2]/div[1]/a")
    public WebElement apply_online_btn;

    @FindBy(xpath = "/html/body/section[2]/div[2]/div/div/div/div/div[2]/div[2]/form/div[1]")
    public WebElement apply_header;

    @FindBy(css = "#applicant_name")
    public WebElement name_txtBox;

    @FindBy(id = "email")
    public WebElement email_txtBox;

    @FindBy(name = "phone")
    public WebElement phone_txtBox;

    @FindBy(className = "wpjb-errors")
    public WebElement error_msg;

    @FindBy(className = "wpjb-submit")
    public WebElement send_application_btn;

    @Title("check that post is South African")
    public void check_location()
    {   steps.shortWait();
        String location = location_tab.getText();
        assertThat(location, containsText("South Africa"));
    }

    @Title("open the first job opening")
    public void open_job_opening()
    {
        steps.clickOn(first_job_opening_link);
        steps.shortWait();
    }

    @Title("click apply online")
    public void  click_apply_online()
    {
        steps.clickOn(apply_online_btn);
        apply_header.isDisplayed();
    }

    @Title("fill in form")
    public void fill_in_form(String name, String email)
    {
        steps.typeInto(name_txtBox, name);
        steps.typeInto(email_txtBox, email);
        steps.typeInto(phone_txtBox, steps.genaratePhoneNumber());
    }

    @Title("click send application")
    public void click_send_app_btn()
    {
        steps.clickOn(send_application_btn);
    }

    @Title("assert error message is displayed")
    public void error_message_isDisplayed()
    {
        steps.shortWait();
        shouldBeVisible(error_msg);
    }


}
