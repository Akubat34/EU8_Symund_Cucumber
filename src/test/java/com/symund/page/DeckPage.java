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

    //ul[@class='app-navigation-entry__children']//li//span


}
