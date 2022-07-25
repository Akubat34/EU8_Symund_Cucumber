package com.symund.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetStatusPage extends BasePage{

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-online']")
    public WebElement onlineButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement awayButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-dnd']")
    public WebElement doNotDisturbBtn;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-invisible']")
    public WebElement invisibleButton;

    @FindBy(xpath = "//form[@class='custom-input__form']")
    public WebElement statusMessageBox;

    @FindBy(xpath = "//button[@class='custom-input__emoji-button']")
    public WebElement emojiButton;




}
