package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage {

    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "new-contact-button")
    public WebElement newContact;

    @FindBy(id = "contact-org")
    public WebElement companyName;

    @FindBy(id = "contact-title")
    public WebElement titleName;

    @FindBy(id = "contact-fullname")
    public WebElement fullName;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> middleColumn;

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement numberOfContacts;

    @FindBy (xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement pictureButton;

    @FindBy ( xpath = "//span[.='Choose from Files']")
    public WebElement chooseFiles ;

    @FindBy ( xpath =  "//span[.='5.jpg']")
    public WebElement firstJPG;

    @FindBy ( xpath =  "//span[.='25.jpg']")
    public WebElement secondJPG;

    @FindBy (xpath = "//button[.='Choose']")
    public WebElement chooseButton;

    @FindBy (xpath = "//div[@class='contact-header-avatar__photo']")
    public WebElement avatarURL;

    @FindBy (xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[5]")
    public WebElement threeDotButton;
    
    @FindBy (xpath = "(//span[.='Delete'])[5]")
    public WebElement deleteButton;
    
}
