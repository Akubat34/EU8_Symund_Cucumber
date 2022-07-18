package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * Enables  user to navigate to the desire module
     * @param module
     */
    public void navigateTo(String module){
        String locator = "//li[@data-id='" + module.toLowerCase() +"']";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }



}
