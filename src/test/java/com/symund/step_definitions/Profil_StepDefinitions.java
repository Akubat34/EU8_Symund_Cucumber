package com.symund.step_definitions;

import com.symund.page.LoginPage;
import com.symund.page.settingPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Profil_StepDefinitions {
    settingPage settingPage =new settingPage();
    LoginPage loginPage = new LoginPage();
    @Given("click on the profile icon")
    public void click_on_the_profile_icon() {

        loginPage.avatardiv.click();
    }
    @When("click the setting button")
    public void click_the_setting_button() {

        settingPage.settings.click();
    }
    @Then("verify user is on the profile setting page")
    public void verify_user_is_on_the_profile_setting_page() {
      String expectedTitle = "Settings - Symund - QA";
      Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }

    @And("change the name in the Full name box with {string}")
    public void changeTheNameInTheFullNameBoxWith(String string) {

        settingPage.fullname.sendKeys(string);

    }
    @Then("verify user has changed the {string}")
    public void verify_user_has_changed_the(String string) {
        BrowserUtils.waitFor(5);
        boolean f = settingPage.fullname.isDisplayed();
        Assert.assertTrue(f);

    }
    @When("make {string} info as private")
    public void make_info_as_private(String string) {
        BrowserUtils.waitFor(5);
        settingPage.phoneNumber.click();
        BrowserUtils.waitFor(5);
        settingPage.privateClick.click();

    }
    @Then("verify that {string} information can be made private")
    public void verify_that_information_can_be_made_private(String string) {
        String classOfIcon = settingPage.iconOfVisibility.getAttribute("class");

        boolean p = classOfIcon.contains("icon-phone");
        Assert.assertTrue(p);

    }
    @Then("Verify that the current local time appears under the Local dropdown menu")
    public void verify_that_the_current_local_time_appears_under_the_local_dropdown_menu() {
        boolean d = settingPage.localeTime.isDisplayed();
        Assert.assertTrue(d);


    }



}
