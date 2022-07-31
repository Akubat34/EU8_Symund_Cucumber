package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Magnify icon']")
    public WebElement Magnify_icon;

    @FindBy(css = ".icon-contacts.menutoggle")
    public WebElement contacts_icon;


    @FindBy(css = "input.unified-search__form-input")
    public WebElement FormBox;

    @FindBy(css = "input#contactsmenu-search")
    public WebElement ContactsBox;


    @FindBy(xpath = "//strong[.='Notes']")
    public WebElement Notes;

    @FindBy(xpath = "//img[@aria-describedby='image-36018']")
    public WebElement image;

    @FindBy(css = ".logo.logo-icon")
    public WebElement Symund_icon;

    @FindBy(xpath = "//h3/span")
    public WebElement outPutFile;

    @FindBy(css = "h2.app-sidebar-header__maintitle")
    public WebElement searchedFilesDetailsTitle;

    @FindBy(css=".full-name")
    public WebElement actualContactName;


}
