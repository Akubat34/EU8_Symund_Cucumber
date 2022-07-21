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
}
