package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class settingPage extends BasePage {

    public settingPage() {PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement fullname;

    @FindBy(xpath = "//form[@id='phoneform']//span")
    public WebElement phoneNumber;

    @FindBy(xpath = "//a[@data-action='v2-private']")
    public WebElement privateClick;

    @FindBy (xpath = "//div[@id='localeexample']")
    public WebElement localeTime;
    @FindBy(xpath = "//li[@data-id='settings']//a")
    public WebElement settings;

    @FindBy(xpath = "//form[@id='phoneform']//div[@class='federation-menu']//span")
    public WebElement iconOfVisibility;









}
