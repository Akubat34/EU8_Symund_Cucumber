package com.symund.page;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TasksPage extends BasePage {


    @FindBy(xpath = "//div[@class='app-navigation-entry-icon sprt-add']")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement addListPlaceholder;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/form/input[3]")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[@class='icon icon-sprt-bw sprt-task-star']")
    public WebElement star;

    @FindBy(xpath = "//label[@class='reactive no-nav']")
    public WebElement checkBox;

    @FindBy(xpath = "//span[@title='Important']")
    public WebElement importantTaskBar;

    @FindBy(id = "target")
    public WebElement taskPlaceHolder;

    @FindBy(xpath = "//span[@title='Completed']")
    public WebElement completedTaskBar;

    public boolean checkTask(String name) {
        String locator = "//div[div='" + name + "']";
        return Driver.getDriver().findElement(By.xpath(locator)).getText().equalsIgnoreCase(name);
    }

    /**
     * clicks the checkbox to do it completed
     * @param name
     */
    public void clickTaskCheckBox(String name) {
        String locator = "//div[*='" + name + "']/../div/label";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }

    /**
     * To check task can be checked completed
     *
     * @param name
     * @return
     */
    public boolean checkCompletedTask(String name) {
        boolean result = false;
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//ol[@collection-id='completed']"));

        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(name)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * check the task is it checked or not to do it completed
     * @param newTaskName name that you enter
     * @return  task list include your task list
     */
    public boolean checkTasksList(String newTaskName) {
        List<WebElement> tasks = Driver.getDriver().findElements(By.xpath("//ul[@class='app-navigation__list']/div/li/a/span"));
        List<String> textOfTasks = new ArrayList<>();
        for (WebElement each : tasks) {
            textOfTasks.add(each.getAttribute("title"));
        }

        return textOfTasks.contains(newTaskName);

    }

    /**
     * deletes list
     *
     * @param name tas list name
     */
    public void deleteList(String name) {


        String locator = "//span[@title='" + name + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));

        element.click();
        String locator1 = "//span[@title='" + name + "']/../../div/div/div";
        WebElement deleteElement = Driver.getDriver().findElement(By.xpath(locator1));
        deleteElement.click();

        String deleteLocator = "//li[@class='action has-tooltip']";
        Driver.getDriver().findElement(By.xpath(deleteLocator)).click();
        BrowserUtils.waitFor(10);


    }

    /**
     * finds element in task list
     * @param name
     * @return
     */
    public WebElement findTasksList(String name) {
        String locator = "//span[@title='" + name + "']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    /**
     * checks the task that you named is it important or not
     * @param name Task name
     * @return Task is checked or not
     */
    public boolean checkTaskIsImportant(String name){
        List<WebElement> element =Driver.getDriver().findElements(By.xpath("//div[@class='task-info']"));
        boolean result=false;
        for (WebElement webElement : element) {
            if (webElement.getText().equalsIgnoreCase(name)){
                result=true;
            }
        }
        return result;
    }

    public List<String> checksTheNumberOfCurrentTask(){
        String locator ="(//div[@class='app-navigation-entry__counter'])";
        int number = Driver.getDriver().findElements(By.xpath(locator)).size();
        System.out.println(number);
        List<WebElement> webElements = new ArrayList<>();
        List<String> element =new ArrayList<>();

        for (int i = 7; i <= number; i++) {
            locator ="(//div[@class='app-navigation-entry__counter'])" + "[" + i +"]";
            webElements.add(Driver.getDriver().findElement(By.xpath(locator)));
        }
        System.out.println(webElements.size());
        for (WebElement webElement : webElements) {
            element.add(webElement.getText());
        }



        return element;
    }


}
