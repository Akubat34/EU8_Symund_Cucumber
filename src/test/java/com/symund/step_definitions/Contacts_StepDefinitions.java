package com.symund.step_definitions;

import com.symund.page.BasePage;
import com.symund.page.ContactsPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.KeyFactorySpi;

public class Contacts_StepDefinitions extends BasePage {
    ContactsPage contactsPage = new ContactsPage();


    String pictureURL1, pictureURL2;

    @When("user clicks the New Contacts button")
    public void user_clicks_the_new_contacts_button() {
        contactsPage.newContact.click();
    }
    @And("user types {string} instead of New Contact text")
    public void userTypesOnTheNameField(String name) {
        contactsPage.fullName.clear();
        contactsPage.fullName.sendKeys(name);
    }
    @When("user types {string} on the company field")
    public void user_types_the_company_field(String company) {
        contactsPage.companyName.sendKeys(company);
    }
    @When("user types {string} on the title field")
    public void user_types_the_title_field(String title) {
        contactsPage.titleName.sendKeys(title);
    }
    @Then("verify that {string} should match on the all contacts")
    public void verify_that_new_contact_appears_on_the_all_contacts(String name) {
        for (WebElement element : contactsPage.middleColumn) {
            if (name.equals(element)){
                Assert.assertEquals(name, element);
            }
        }


    }

    @Then("verify that list of the contact number should equal number of the contacts near the All Contacts tab")
    public void verify_that_list_of_the_contact_number_should_equal_number_of_the_contacts_near_the_all_contacts_tab() {
        String number = contactsPage.middleColumn.size()+"";
        String totalContact = contactsPage.numberOfContacts.getText();
        Assert.assertEquals(number,totalContact);
    }

    @When("user clicks picture button")
    public void user_clicks_picture_button() {
        contactsPage.pictureButton.click();
    }
    @When("user clicks Choose from files button")
    public void user_clicks_choose_from_files_button() {
        contactsPage.chooseFiles.click();
    }
    @When("user selects 5.jpg file")
    public void user_selects_jpg_file() {
        contactsPage.firstJPG.click();

    }
    @When("user repeats last 4 steps with another picture")
    public void user_repeats_last_steps_with_another_picture() {
        contactsPage.pictureButton.click();
        contactsPage.chooseFiles.click();
        contactsPage.secondJPG.click();
        contactsPage.chooseButton.click();
        pictureURL2 = contactsPage.avatarURL.getAttribute("style");
    }
    @Then("verify that the URL of the both of the pictures are different")
    public void verify_that_the_url_of_the_both_of_the_pictures_are_different() {
        Assert.assertFalse(pictureURL1.equals(pictureURL2));
    }


    @And("user clicks choose button")
    public void userClicksChooseButton() {
        contactsPage.chooseButton.click();
        pictureURL1 = contactsPage.avatarURL.getAttribute("style");
    }

    @And("user clicks three dot button")
    public void userClicksThreeDotButton() {
        contactsPage.threeDotButton.click();
    }

    @And("user clicks Delete button")
    public void userClicksDeleteButton() {
        contactsPage.deleteButton.click();
    }

    @Then("verify that the contact should be removed")
    public void verifyThatTheContactShouldBeRemoved() {
        for (WebElement element : contactsPage.middleColumn) {
            Assert.assertFalse(element.getText().equals("Ertan"));
        }
    }
}
