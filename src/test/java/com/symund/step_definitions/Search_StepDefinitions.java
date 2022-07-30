package com.symund.step_definitions;

import com.symund.page.SearchPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class Search_StepDefinitions {
    SearchPage searchPage= new SearchPage ();





    @And("user clicks to the Magnify icon")
    public void user_clicks_to_the_Magnify_icon()  {
        BrowserUtils.waitFor(5);
        searchPage.Magnify_icon.click();

    }

    @And("user click to the contacts icon")
    public void user_click_to_the_contacts_icon() throws InterruptedException {


        Thread.sleep(5000);
        searchPage.contacts_icon.click();

    }


    @Then("user types {string} name")
    public void user_types_name(String string) throws InterruptedException {
      Thread.sleep(8000);
       searchPage.FormBox.sendKeys(string);
       BrowserUtils.waitFor(3);

    }

    @And("user type {string} name")
    public void user_type_name(String string) throws InterruptedException {
        Thread.sleep(8000);

        searchPage.ContactsBox.sendKeys(string);
    }



    @Then("verify that user navigates to the {string} module")
    public void verify_that_user_navigates_to_the_module(String string) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }



   @Then("verify that user can see the {string} name")
    public void verify_that_user_can_see_the_name(String contactName) throws InterruptedException {

        Thread.sleep(8000);
        Assert.assertEquals(contactName,searchPage.actualContactName.getText());

    }

    @And("user clicks on image")
    public void user_clicks_on_image() {
        searchPage.image.click();

    }
    @Then("verify that user can see the image")
    public void verify_that_user_can_see_the_image() {
       Assert.assertTrue(searchPage.image.isDisplayed());
    }

    @And("user clicks on Symund icon")
    public void user_clicks_on_symund_icon() {
        searchPage.Symund_icon.click();
    }
    @Then("verify that user can see {string} title")
    public void verify_that_user_can_see_title(String expectedTitle) {
    Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
    @And("user click on outputFile")
    public void user_click_on_outputFile() {

        searchPage.outPutFile.click();

    }


    @Then("verify that user can see the details of {string} file")
    public void verifyThatUserCanSeeTheDetailsOfFile(String expectedFileTitle) {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedFileTitle,searchPage.searchedFilesDetailsTitle.getText().trim());


    }
}
