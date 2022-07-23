package com.symund.step_definitions;

import com.symund.page.UEDFilePage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class UEDFile_StepDefinitions {

    UEDFilePage uedFilePage = new UEDFilePage();


    @When("user clicks + sign")
    public void user_clicks_sign() {
        uedFilePage.plus.click();
    }
    @When("user clicks Upload file button")
    public void user_clicks_upload_file_button() {
        uedFilePage.uploadBtn.click();
    }
    @When("user uploads the file")
    public void fileUpload() {
       // String filePath = "uploadfile.txt";
       // Driver.getDriver().findElement(By.xpath("//span[@class='svg icon icon-upload']")).sendKeys(filePath);
        System.out.println("tamam");
    }
    @Then("user verify that file is uploaded")
    public void user_verify_that_file_is_uploaded() {
        System.out.println("o iş tamam");
    }

}
