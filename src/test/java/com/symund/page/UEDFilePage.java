package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UEDFilePage {

    public UEDFilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement files;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plus;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadBtn;

    @FindBy(xpath = "//span[@class='innernametext' and .='Group1']")
    public WebElement uploadedFile;

    @FindBy(xpath = "//span[@class='icon icon-folder svg']")
    public WebElement NewFolder;

    @FindBy(xpath = "//input[@id='view12-input-folder']")
    public WebElement NewFileName;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement arrowBtn;

    @FindBy(xpath = "//tr[@data-file='qw']")
    public WebElement createdFolder;

    @FindBy(xpath = "//tr[@data-file='bc']")
    public WebElement selectedFolder;
    //1
    @FindBy(xpath = "//tr[@data-entryname='as']")
    public WebElement targetFolder;

    @FindBy(xpath = "//span[@class ='icon icon icon-external']")
    public WebElement MoveOrCopyBtn;
    //2
    @FindBy(xpath = "//button[@class='primary']")
    public WebElement CopyOrMoveBtn;

    @FindBy(xpath = "//tr[@data-file='as']")
    public WebElement targetedFolder;

    @FindBy(xpath = "(//div[@class='crumb'])[1]")
    public WebElement folderHome;

    @FindBy(xpath = "//span[@class='icon icon icon-delete']")
    public WebElement deleteFolder;
    //**
    @FindBy(xpath = "//span[@class='innernametext' and .='new$']//..//..//a[@data-action='menu']")
    public WebElement threeDotsMenu;

    @FindBy(xpath = "//li[@class=' action-delete-container']")
    public WebElement DeleteFolderBtn;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement DeletedFilesBtn;

    @FindBy(xpath = "//a[@id='modified']//span[@class='sort-indicator icon-triangle-n']")
    public WebElement deletedTriangle;

    @FindBy(xpath = "//tr[@data-path='new$']")
    public WebElement verifyDeletedFolder;

    @FindBy(xpath = "//span[@class='innernametext' and .='new$']//..//..//a[@data-action='Restore']")
    public WebElement Restore;

    @FindBy(xpath = "//span[@class='info']")
    public WebElement totalNumber;









}



