package com.symund.step_definitions;

import com.symund.page.BasePage;
import com.symund.page.FilesAddToFavoritesPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FilesAddToFavorites_StepDefinitions extends BasePage {

    FilesAddToFavoritesPage filesAddToFavoritesPage = new FilesAddToFavoritesPage();

    @Given("user navigates to Files module")
    public void user_navigates_to_files_module() {
        navigateTo("Files");
    }

    @Given("user clicks on the three dots next to the file with {string}")
    public void user_clicks_on_the_three_dots_next_to_the_file_with(String string) {
        WebElement threeDotsMenu = Driver.getDriver().findElement(By.xpath("//a[contains(@href, '"+ string + "')]//span[@class='icon icon-more']"));
        threeDotsMenu.click();
    }

    @Given("user clicks on Add to favorites button")
    public void user_clicks_on_add_to_favorites_button() {
        filesAddToFavoritesPage.addToFavoritesButton.click();
    }

    @Given("user clicks on the Favorites button on the left menu")
    public void user_clicks_on_the_favorites_button_on_the_left_menu() {
        filesAddToFavoritesPage.favoritesButton.click();
    }

    @Then("user verifies that the file with the {string} is seen on the Favorites page")
    public void user_verifies_that_the_file_with_the_is_seen_on_the_favorites_page(String string) {
        WebElement existingFile = Driver.getDriver().findElement(By.xpath("//tr[@data-file='"+ string +"']"));
        Assert.assertEquals(string, existingFile.getAttribute("data-file"));
    }

}
