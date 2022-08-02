package com.symund.step_definitions;

import com.symund.page.DashBoardPage;
import com.symund.page.LoginPage;
import com.symund.page.SetStatusPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlineStatus_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    SetStatusPage setStatusPage = new SetStatusPage();

    @Given("User navigates to the symund login page")
    public void user_navigates_to_the_symund_login_page() {
        Driver.getDriver().get("https://qa.symund.com/");
    }

    @When("User leaves {string} in username")
    public void user_leaves_in_username(String string) {
        loginPage.username.sendKeys(string);
    }

    @When("User leaves {string} in password")
    public void user_leaves_in_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginBtn.click();
        BrowserUtils.sleep(10);
    }

    @Then("user can view Online Status on Dashboard")
    public void user_can_view_online_status_on_dashboard() {
        Assert.assertTrue(dashBoardPage.statusButton.isDisplayed());
    }


    @When("user clicks status button on the dashboard")
    public void userClicksStatusButtonOnTheDashboard() {
        dashBoardPage.statusButton.click();
    }

    @And("user selects online {string}")
    public void userSelectsOnline(String status) {
        switch (status) {
            case "online":
                setStatusPage.onlineButton.click();
                break;
            case "away":
                setStatusPage.awayButton.click();
                break;
            case "doNotDisturb":
                setStatusPage.doNotDisturbBtn.click();
                break;
            default:
                setStatusPage.invisibleButton.click();

        }
    }

    @And("user clicks close button")
    public void userClicksCloseButton() {
        setStatusPage.closeButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user can see {string} on the dashboard")
    public void userCanSeeOnTheDashboard(String icons) {
        Assert.assertTrue(dashBoardPage.statusIcon.getAttribute("class").contains(icons));
    }

    @And("user selects {string}")
    public void userSelects(String options) {
        switch (options) {
            case "inMeeting":
                setStatusPage.inMeeting.click();
                break;
            case "commuting":
                setStatusPage.commuting.click();
                break;
            case "workingRemotely":
                setStatusPage.workingRemotely.click();
                break;
            case "outSick":
                setStatusPage.outSick.click();
                break;
            default:
                setStatusPage.vacationing.click();
        }

    }

    @And("user clicks set status message button")
    public void userClicksSetStatusMessageButton() {
        setStatusPage.setStatusMessageBtn.click();
        BrowserUtils.sleep(2);

    }

    @Then("user can see {string} on the status text")
    public void userCanSeeOnTheStatusText(String expectedText) {
        System.out.println(dashBoardPage.statusButton.getText());
        Assert.assertEquals(expectedText,dashBoardPage.statusButton.getText());
    }


    @And("user clicks status message box")
    public void userClicksStatusMessageBox() {
        setStatusPage.statusMessageBox.click();
       // BrowserUtils.sleep(2);
    }

    @And("user clears message box")
    public void userClearsMessageBox() {
        setStatusPage.statusMessageBox.clear();
       // BrowserUtils.sleep(2);
    }

    @And("user leaves a {string}")
    public void userLeavesA(String message) {
        setStatusPage.statusMessageBox.sendKeys(message);
       // BrowserUtils.sleep(2);
    }


    @And("user clicks emoji button")
    public void userClicksEmojiButton() {
        setStatusPage.emojiButton.click();
      //  BrowserUtils.sleep(2);
    }


    @And("user clicks {string}")
    public void userClicks(String emojiName) {
        setStatusPage.getEmoji(emojiName).click();
        //BrowserUtils.sleep(2);
    }

    @Then("user can see {string} on the status")
    public void userCanSeeOnTheStatus(String expectedMessage) {
        System.out.println("dashBoardPage.statusButton.getText() = " + dashBoardPage.statusButton.getText());
        Assert.assertEquals(expectedMessage,dashBoardPage.statusButton.getText());
    }


}
