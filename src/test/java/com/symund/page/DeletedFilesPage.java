package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeletedFilesPage extends BasePage{

    public DeletedFilesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFilesTab;

    @FindBy(xpath = ("(//th/a[@id='modified'])[12]"))
    public WebElement deletedButton;

    @FindBy(xpath = "(//a[@data-action='menu'])[2]")
    public WebElement threeDot;

    @FindBy(xpath = "//a[@data-action='Delete']")
    public WebElement deletePermanently;

    @FindBy(xpath = "(//a[@data-action='Restore'])[1]")
    public WebElement restore;


    @FindBy(xpath = "(//th/div/a[@data-sort='name'])[12]")
    public WebElement name;



}
