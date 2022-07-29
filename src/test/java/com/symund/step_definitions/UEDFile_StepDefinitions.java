package com.symund.step_definitions;

import com.symund.page.UEDFilePage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class UEDFile_StepDefinitions {

    UEDFilePage uedFilePage = new UEDFilePage();

    //1
    @When("user clicks + sign")
    public void user_clicks_sign() {
        uedFilePage.plus.click();
    }
    @When("user clicks Upload file button and uploads the file")
    public void user_clicks_upload_file_button() {

        String rootPath = System.getProperty("user.dir");
        String filePath = "\\src\\test\\resources\\Group1.txt";
        uedFilePage.uploadBtn.sendKeys(rootPath+"/"+filePath);
        System.out.println(rootPath+filePath);
        BrowserUtils.waitFor(3);
    }

    @Then("user verify that file is uploaded")
    public void user_verify_that_file_is_uploaded() {
        Assert.assertTrue(uedFilePage.uploadedFile.isDisplayed());
        Actions action= new Actions(Driver.getDriver());
        action.contextClick(uedFilePage.uploadedFile).build().perform();
        BrowserUtils.waitFor(3);
        uedFilePage.deleteFolder.click();

    }

    //2
    @Then("user clicks New folder button")
    public void user_clicks_new_folder_button() {
        uedFilePage.NewFolder.click();
    }
    @Then("user enters the new file name")
    public void user_enters_the_new_file_name() {

        uedFilePage.NewFileName.sendKeys("qw");
    }
    @Then("user hits the arrow")
    public void user_hits_the_arrow() {
        uedFilePage.arrowBtn.click();
    }
    @Then("user verify that New folder is in folders area")
    public void user_verify_that_new_folder_is_in_folders_area() {
        uedFilePage.files.click();
        Assert.assertTrue(uedFilePage.createdFolder.isDisplayed());
        BrowserUtils.waitFor(3);
        Actions action= new Actions(Driver.getDriver());
        action.contextClick(uedFilePage.createdFolder).build().perform();
        BrowserUtils.waitFor(3);
        uedFilePage.deleteFolder.click();
    }

    //3
    @Then("user right-clicks on the selected folder and clicks the Move or copy button from folders area")
    public void user_right_clicks_on_the_selected_folder_and_clicks_the_move_or_copy_button() {
        Actions action= new Actions(Driver.getDriver());
        action.contextClick(uedFilePage.selectedFolder).build().perform();
        uedFilePage.MoveOrCopyBtn.click();
    }
    @Then("user selects target folder from Choose target folder area")
    public void user_selects_target_folder_from_choose_target_folder_area() {
        uedFilePage.targetFolder.click();
    }
    @Then("user selects and clicks one of them Copy to or Move to")
    public void user_selects_and_clicks_one_of_them_copy_to_or_move_to() {
        uedFilePage.CopyOrMoveBtn.click();
    }
    @Then("user clicks the targeted folder")
    public void user_clicks_the_target_folder() throws InterruptedException {
        Thread.sleep(3000);
        uedFilePage.targetedFolder.click();
    }
    @Then("user verifies that selected folder is there")
    public void user_verifies_that_selected_folder_is_there() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(uedFilePage.selectedFolder.isDisplayed());
        BrowserUtils.waitFor(3);
        Actions action= new Actions(Driver.getDriver());
        action.contextClick(uedFilePage.selectedFolder).build().perform();
        BrowserUtils.waitFor(3);
        uedFilePage.MoveOrCopyBtn.click();
        BrowserUtils.waitFor(3);
        uedFilePage.folderHome.click();
        BrowserUtils.waitFor(3);
        uedFilePage.CopyOrMoveBtn.click();
    }

    //4
    @Then("user clicks on the selected item's three dots menu")
    public void user_clicks_on_the_selected_item_s_three_dots_menu() {
        BrowserUtils.waitFor(3);
        uedFilePage.threeDotsMenu.click();
    }
    @Then("user clicks the Delete folder button")
    public void user_clicks_the_delete_folder_button() {
        BrowserUtils.waitFor(3);
        uedFilePage.DeleteFolderBtn.click();
    }
    @Then("user clicks the Deleted files button")
    public void user_clicks_the_deleted_files_button() {
        BrowserUtils.waitFor(3);
        uedFilePage.DeletedFilesBtn.click();
    }
    @Then("user verifies that deleted folder is there")
    public void user_verifies_that_deleted_folder_is_there() {
        BrowserUtils.waitFor(7);
        uedFilePage.deletedTriangle.click();
        BrowserUtils.waitFor(5);
        Assert.assertTrue(uedFilePage.verifyDeletedFolder.isDisplayed());
        BrowserUtils.waitFor(5);
        uedFilePage.Restore.sendKeys("//tr[@data-path='new$']");
        BrowserUtils.waitFor(5);
        uedFilePage.Restore.click();
    }

    //5
    @Then("user can see the total number of files and folders under the files list table")
    public void user_can_see_the_total_number_of_files_and_folders_under_the_files_list_table() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(uedFilePage.totalNumber.isDisplayed());
        String totalNumberOfFoldersAndFiles = uedFilePage.totalNumber.getText();
        System.out.println(totalNumberOfFoldersAndFiles);
    }

}
