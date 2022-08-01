package com.symund.step_definitions;

import com.symund.page.DashBoardPage;
import com.symund.page.LoginPage;
import com.symund.page.SetStatusPage;
import com.symund.utilities.Driver;
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
    }

    @Then("user can view Online Status on Dashboard")
    public void user_can_view_online_status_on_dashboard() {
        Assert.assertTrue(dashBoardPage.statusButton.isDisplayed());
    }
}
