package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage_Ertan {

    public FilesPage_Ertan(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavoritesButton;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesButton;

    @FindBy(xpath = "//span[.='Rename']")
    public WebElement renameButton;

    @FindBy(xpath = "//form//input[@type='text']")
    public WebElement nameFieldInput;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsButton;

    @FindBy(id = "comments")
    public WebElement commentsTabButton;

    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement commentsField;

    @FindBy(xpath = "//div[@class='comment__message']")
    public WebElement postedCommentMessage;

    @FindBy(xpath = "//div[@class='comment comments__list'][1]//button")
    public WebElement postedCommentActionsButton;

    @FindBy(xpath = "//span[.='Delete comment']")
    public WebElement deleteCommentButton;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[1]/span")
    public WebElement commentDeletedMessage;

}
