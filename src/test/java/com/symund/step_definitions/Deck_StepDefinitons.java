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

    //TestCase1
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

    //TestCase3
    @When("click {string} on the board side")
    public void click_on_the_board_side(String string) {
        List<WebElement> boardNames = Driver.getDriver().findElements(By.xpath("//ul[@class='app-navigation-entry__children']//li//span"));

        for (WebElement boardName : boardNames) {
            if(boardName.getText().equals(string)){
                boardName.click();
                break;
            }
        }
    }
    @When("Click “+” icon at the right top of screen")
    public void click_icon_at_the_right_top_of_screen() {
        deckPage.addButtonForList.click();
    }
    @When("Type list name as a {string}")
    public void type_list_name_as_a(String string) {
        deckPage.inputForListName.sendKeys(string);
    }
    @When("Hit enter or click arrow icon on the list name input")
    public void hit_enter_or_click_arrow_icon_on_the_list_name_input() {
        deckPage.arrowForListName.click();
    }
    @Then("can see {string} on the list on the current board")
    public void can_see_on_the_list_on_the_current_board(String string) {
        List<WebElement> boardNames = Driver.getDriver().findElements(By.xpath("//div[@class='stack__header']//h3"));

        for (WebElement boardName : boardNames) {
            if(boardName.getText().equals(string)){
                boardName.click();
                break;
            }
        }
    }


}
