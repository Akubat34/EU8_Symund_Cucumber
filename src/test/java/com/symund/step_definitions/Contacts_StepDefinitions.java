package com.symund.step_definitions;

import com.symund.page.ContactsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Contacts_StepDefinitions {
    ContactsPage contactsPage = new ContactsPage();

    @When("user clicks the New Contacts button")
    public void user_clicks_the_new_contacts_button() {
        contactsPage.newContact.click();
    }
    @And("user types {string} on the name field")
    public void userTypesOnTheNameField(String name) {
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


}
