package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class DeckPage {
    public DeckPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "app-navigation-toggle")
    public WebElement hamburgerMenuAtLeft;

    @FindBy(xpath = "//ul[@class='app-navigation__list']//div[@class='app-navigation-entry-icon icon-add']")
    public WebElement plusSignOnLeft;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNameInput;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement arrowSignOnLeftOfInput;

    //TestCase3
    @FindBy(xpath = "//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip']")
    public WebElement addButtonForList;

    @FindBy(xpath = "//div[@id='stack-add']//form//input[@placeholder='List name']")
    public WebElement inputForListName;

    @FindBy(xpath = "//div[@id='stack-add']//form//input[@type='submit']")
    public WebElement arrowForListName;

    @FindBy(xpath = "(//div[@class='stack__header']//button)[2]")
    public WebElement signPlusOfTask;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement nameInputOfTask;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement arrowOfTask;

    @FindBy(xpath = "//h3[@class='stack__title has-tooltip']//..//..//div[@class='smooth-dnd-container vertical']//div[@class='card-controls compact-item']//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement threeDotsOfTheTask;

    @FindBy(xpath = "//div[@class='popover__wrapper']//button[1]")
    public WebElement assignToMeButton;

    @FindBy(xpath = "//div[@class='popover__wrapper']//button[1]//span[2]")
    public WebElement assignToMeButtonSpan;

    @FindBy(xpath = "//div[@class='avatars']")
    public WebElement avatarInTheTaskFrame;

}
