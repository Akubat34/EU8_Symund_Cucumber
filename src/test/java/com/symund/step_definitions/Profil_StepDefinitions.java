package com.symund.step_definitions;

import com.symund.page.DashBoardPage;
import com.symund.page.LoginPage;
import com.symund.page.SettingPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Profil_StepDefinitions {



    SettingPage settingPage =new SettingPage();
    DashBoardPage dashboardPage = new DashBoardPage();

    @Given("click on the profile icon")
    public void click_on_the_profile_icon() {

        dashboardPage.userBtn.click();
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
    public void changeTheNameInTheFullNameBoxWith(String expectedFullname) {

        settingPage.fullName.clear();
        settingPage.fullName.sendKeys(expectedFullname);
        BrowserUtils.waitFor(7);



    }
    @Then("verify user has changed the {string}")
    public void verify_user_has_changed_the(String expectedFullname) {

        settingPage.navigateTo("Files");
        BrowserUtils.waitFor(3);
        dashboardPage.userBtn.click();

        Assert.assertEquals(expectedFullname, settingPage.userName.getText());

    }


    @Then("User can see the following from the personal information headings")
    public void user_can_see_the_following_from_the_personal_information_headings(List<String> expectedTitles) {
        List<String> actualTitles = BrowserUtils.getElementsText(settingPage.personelInfoTitle);
        Assert.assertTrue(actualTitles.containsAll(expectedTitles));


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
        Assert.assertTrue(classOfIcon.contains("icon-phone"));

    }
    @Then("Verify that the current local time appears under the Local dropdown menu")
    public void verify_that_the_current_local_time_appears_under_the_local_dropdown_menu() {
        BrowserUtils.waitForVisibility(settingPage.localDate, 5);
        Assert.assertTrue(settingPage.localeTime.isDisplayed());
        Assert.assertEquals(settingPage.getCurrentLocalDate(),settingPage.localDate.getText());

    }


}
