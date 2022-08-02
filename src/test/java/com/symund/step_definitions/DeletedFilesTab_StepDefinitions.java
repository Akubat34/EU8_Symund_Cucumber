package com.symund.step_definitions;

import com.symund.page.AllFilesPage;
import com.symund.page.DeletedFilesPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeletedFilesTab_StepDefinitions {

    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();
    AllFilesPage allFilesPage = new AllFilesPage();

    @When("user clicks deletedFilesTab")
    public void user_clicks_deleted_files_tab() {
        deletedFilesPage.deletedFilesTab.click();
    }

    @When("user clicks deletedButton")
    public void user_clicks_deleted_button() {
        deletedFilesPage.deletedButton.click();
    }

    @When("user clicks threeDot")
    public void user_clicks_three_dot() {
        deletedFilesPage.threeDot.click();
    }

    @When("user clicks deletePermanently")
    public void user_clicks_delete_permanently() {
        deletedFilesPage.deletePermanently.click();
    }

    @When("user clicks restore button")
    public void user_clicks_restore_button() {
        deletedFilesPage.restore.click();
    }

    @When("user clicks allFiles button")
    public void user_clicks_all_files_button() {
        allFilesPage.allFiles.click();
    }

    @Then("verify that deleted files are ordered by newest to oldest")
    public void verify_that_deleted_files_are_ordered_by_newest_to_oldest() {
        List<WebElement> allDeletedFiles = Driver.getDriver().findElements(By.xpath("//span[@class='innernametext']"));
        deletedFilesPage.deletedButton.click();
        List<WebElement> allDeletedFilesOrdered = Driver.getDriver().findElements(By.xpath("//span[@class='innernametext']"));
        Assert.assertEquals(allDeletedFiles.get(0).getText(), allDeletedFilesOrdered.get(0).getText());
    }


    @Then("verify that user can order the all deleted files by newest to oldest or visa versa")
    public void verify_that_user_can_order_the_all_deleted_files_by_newest_to_oldest_or_visa_versa() {
        List<WebElement> allDeletedFiles = Driver.getDriver().findElements(By.xpath("//span[@class='innernametext']"));
        deletedFilesPage.deletedButton.click();
        List<WebElement> allDeletedFilesOrdered = Driver.getDriver().findElements(By.xpath("//span[@class='innernametext']"));
        Assert.assertEquals(allDeletedFiles.get(0).getText(), allDeletedFilesOrdered.get(0).getText());
    }

    @When("user clicks name button")
    public void user_clicks_name_button() {
        deletedFilesPage.name.click();
    }
    @Then("verify that user can order alphabetically")
    public void verify_that_user_can_order_alphabetically() {

        List<WebElement> allDeletedFiles = Driver.getDriver().findElements(By.xpath("//span[@class='innernametext']"));
        for (WebElement each : allDeletedFiles) {
            Assert.assertTrue(allDeletedFiles.get(0).getText().toUpperCase().charAt(0) <= each.getText().toUpperCase().charAt(0));

        }
    }

    @Then("verify that the file could be deleted permanently")
    public void verify_that_the_file_could_be_deleted_permanently() {
        Assert.assertFalse(Driver.getDriver().findElement(By.xpath("(//span[@class='innernametext'])")).isDisplayed());
    }


    @Then("verify that the file added to allFiles page")
    public void verify_that_the_file_added_to_all_files_page() {
        Assert.assertTrue(allFilesPage.recentlyEdited.isDisplayed());
    }
}