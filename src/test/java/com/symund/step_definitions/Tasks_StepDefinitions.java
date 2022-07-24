package com.symund.step_definitions;


import com.symund.page.TasksPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Tasks_StepDefinitions  {

        TasksPage tasksPage = new TasksPage();

        @Then("user navigates to the {string} module")
        public void user_navigates_to_the_module(String moduleName) {
                tasksPage.navigateTo(moduleName);
        }

        @And("user clicks \"AddList...\" button and types {string} name")
        public void userClicksButtonAndTypesName( String name) {
                if (tasksPage.checkTasksList(name)){
                        tasksPage.deleteList(name);
                }
                tasksPage.addListButton.click();
                tasksPage.addListPlaceholder.sendKeys(name);
        }

        @Then("user click the save button")
        public void user_click_the_save_button() {
                tasksPage.saveBtn.click();
        }

        @Then("user types {string} to the placeholder which includes \"Add a current task to \"To Do\"...\" message and user hits the enter")
        public void user_types_to_the_placeholder_which_includes_add_a_current_task_to_to_do_message_and_user_hits_the_enter(String string) {
                tasksPage.taskPlaceHolder.sendKeys(string, Keys.ENTER);
        }

        @Then("verify that user can create {string} with given name")
        public void verify_that_user_can_create_with_given_name(String name) {
                BrowserUtils.waitFor(5);
                Assert.assertTrue(tasksPage.checkTasksList(name));
        }

        @Then("Click the checkbox left side of the task name that {string}")
        public void click_the_checkbox_left_side_of_the_task_name(String name) {
                tasksPage.clickTaskCheckBox(name);
        }

        @Then("Verify that user can add {string} into completed tasks")
        public void verify_that_user_can_add_task_into_completed_tasks(String name) {
                tasksPage.checkCompletedTask(name);
         }


        @And("Click the checkbox right side of the task bar")
        public void clickTheCheckboxRightSideOfTheTaskBar() {
                tasksPage.star.click();
        }

       

        @Then("verify that user could create {string} with given name")
        public void verifyThatUserCouldCreateWithGivenName(String name) {
                Assert.assertTrue(tasksPage.checkTask(name));
                tasksPage.deleteList("To Do");
        }

        @And("user click completed task bar")
        public void userClickCompletedTaskBar() {
                tasksPage.completedTaskBar.click();
        }

        @And("user click important task bar")
        public void userClickImportantTaskBar() {
                tasksPage.importantTaskBar.click();
        }

        @Then("Verify that user can check {string} as an important")
        public void verifyThatUserCanCheckAsAnImportant(String name) {
                Assert.assertTrue(tasksPage.checkTaskIsImportant(name));
        }

        @Then("verify that user can see the number of all uncompleted tasks next to the Current tab")
        public void verifyThatUserCanSeeTheNumberOfAllUncompletedTasksNextToTheCurrentTab() {
                BrowserUtils.waitFor(2);
                System.out.println(tasksPage.checksTheNumberOfCurrentTask());

        }
}
