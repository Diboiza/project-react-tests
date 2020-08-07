package projectreact.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;
import projectreact.ReUsableSteps;

@DefaultUrl("page:home.page/careers")
public class Careers extends PageObject
{
    @Steps
    ReUsableSteps steps;

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[1]/div[1]/div/div/div/figure/div/img")
    public WebElement careers_header;

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div/div[4]/a")
    public WebElement south_africa_link;

    @Title("assert I am on the careers page")
    public void click_sa_link()
    {
        steps.shortWait();
        shouldBeVisible(careers_header);
        steps.clickOn(south_africa_link);
    }
}
