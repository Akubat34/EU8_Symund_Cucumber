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

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadBtn;
}



