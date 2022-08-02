package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllFilesPage {

    public AllFilesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='All files']")
    public WebElement allFiles;

    @FindBy(xpath = "(//div[@class='reason'])[1]")
    public WebElement recentlyEdited;

}
