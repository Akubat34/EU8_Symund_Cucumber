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
}
