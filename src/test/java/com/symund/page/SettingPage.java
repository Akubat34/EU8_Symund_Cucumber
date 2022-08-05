package com.symund.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class SettingPage extends BasePage {


            @FindBy(xpath = "//input[@id='displayname']")
            public WebElement fullName;

            @FindBy(xpath = "//div[@id='localeexample']")
            public WebElement localeTime;

            @FindBy(xpath = "//span[@id='localeexample-date']")
            public WebElement localDate;


            @FindBy(xpath = "//li[@data-id='settings']//a")
            public WebElement settings;

            @FindBy(xpath = "//form[@id='phoneform']//div[@class='federation-menu']//span")
            public WebElement iconOfVisibility;

            @FindBy(xpath = "//h3//label")
            public List<WebElement> personelInfoTitle;

            @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
            public WebElement userName;

            /**
             * returns me the formatted date info matching with actual date
             *
             * @return
             */
            public String getCurrentLocalDate() {

                LocalDate localDate = LocalDate.now();
                System.out.println(localDate.toString());

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

                String expectedLocalDate = localDate.format(dtf);
                System.out.println("After formatting: " + expectedLocalDate);

                return expectedLocalDate;

            }
        }



