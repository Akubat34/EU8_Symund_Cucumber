package com.symund.page;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TasksPage extends BasePage{


    @FindBy(xpath = "//div[@class='app-navigation-entry-icon sprt-add']")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement addListPlaceholder;

    @FindBy(xpath ="//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/form/input[3]")
    public WebElement saveBtn;

    /**
     * finds element in task list
     * @param name
     * @return
     */
    public WebElement findTasksList(String name){
        String locator ="//span[@title='"+ name +"']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    /**
     * deletes list
     * @param name
     */

    public void deleteList(String name){


        String locator ="//span[@title='"+ name +"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));

        element.click();
        String locator1 ="//span[@title='" + name + "']/../../div/div/div";
        WebElement deleteElement =Driver.getDriver().findElement(By.xpath(locator1));
        deleteElement.click();

        String deleteLocator ="//li[@class='action has-tooltip']";
        Driver.getDriver().findElement(By.xpath(deleteLocator)).click();
        BrowserUtils.waitFor(10);


    }

    public boolean checkTasksName (String newTaskName){
       List<WebElement> tasks = Driver.getDriver().findElements(By.xpath("//ul[@class='app-navigation__list']/div/li/a/span"));
       boolean isPresent=true;
       List<String > textOfTasks = new ArrayList<>();
        for (WebElement each : tasks) {
            textOfTasks.add(each.getAttribute("title"));
        }

        return textOfTasks.contains(newTaskName);

    }

    @FindBy(xpath = "//button[@class='inline task-star reactive no-nav']/span")
    public WebElement star;

    @FindBy(xpath = "//label[@class='reactive no-nav']")
    public WebElement checkBox;

    @FindBy(xpath = "//div[@class='grouped-tasks']//ol[1]//li")
    public WebElement checked;

    @FindBy(id = "target")
    public WebElement taskPlaceHolder;

    @FindBy(xpath = "//span[@title='Completed']")
    public WebElement completedTaskBar;

    public boolean checkTask (String name){
        String locator ="//div[div='" + name + "']";
        return Driver.getDriver().findElement(By.xpath(locator)).getText().equalsIgnoreCase(name);
    }

    public void clickTaskCheckBox(String name){
        String locator = "//div[*='" + name + "']/../div/label";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }

    /**
     * To check task can be checked completed
     * @param name
     * @return
     */
    public boolean checkCompletedTask(String name){
        boolean result = false;
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//ol[@collection-id='completed']"));

        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(name)){
                result = true;
            }else {
                result= false;
            }
        }
        return result;
    }







}
