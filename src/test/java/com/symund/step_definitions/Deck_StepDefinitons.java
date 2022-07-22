package com.symund.step_definitions;


import com.symund.page.DeckPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Deck_StepDefinitons {

    DeckPage deckPage = new DeckPage();

    @When("Click to “Add board” button on the left side bar")
    public void click_to_add_board_button_on_the_left_side_bar() {
        deckPage.hamburgerMenuAtLeft.click();
        deckPage.plusSignOnLeft.click();
    }
    @When("Type board name as a {string}")
    public void type_board_name_as_a(String string) {
        deckPage.boardNameInput.sendKeys(string);
    }
    @When("Hit enter or click arrow icon")
    public void hit_enter_or_click_arrow_icon() {
        deckPage.arrowSignOnLeftOfInput.click();
    }
    @Then("can see {string} board in the All board list")
    public void can_see_board_in_the_all_board_list(String string) {

        List<WebElement> boardNames = Driver.getDriver().findElements(By.xpath("//ul[@class='app-navigation-entry__children']//li//span"));

        for (WebElement boardName : boardNames) {
            if(boardName.getText().equals(string)){
                Assert.assertTrue(true);
                break;
            }
        }

    }

    //TestCase2
    @Then("user should see {string}")
    public void user_should_see(String string) {
        String actualMessage = deckPage.boardNameInput.getAttribute("validationMessage");
        Assert.assertEquals(string,actualMessage);
    }

}
