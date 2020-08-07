package projectreact.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;
import projectreact.ReUsableSteps;

@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

    @Steps
    ReUsableSteps steps;

    @FindBy(xpath = "/html/body/div[2]/div/a/img")
    private WebElement logo;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/nav/ul/li[5]/a")
    public static WebElement careersBTn;

    @Title("Launch browser and navigate to the ilab homepage")
    public void navigate_to_home(){
        open();
        steps.shortWait();

    }

    @Title("Assert I am on the home page")
    public void i_am_on_homePage()
    {
        shouldBeVisible(logo);
    }

    @Title("Click on careers")
    public void click_careers_link()
    {
        steps.clickOn(careersBTn);
        steps.shortWait();
    }
}
