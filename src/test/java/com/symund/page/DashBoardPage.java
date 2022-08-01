package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    public DashBoardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "expand")
    public WebElement userBtn;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutBtn;

    @FindBy(xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement statusButton;


    @FindBy (xpath = "//*[@id=\"status-status\"]/li/div/button/span")
    public WebElement statusIcon;








}
