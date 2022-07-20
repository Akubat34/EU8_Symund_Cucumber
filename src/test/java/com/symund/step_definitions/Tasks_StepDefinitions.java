package com.symund.step_definitions;


import com.symund.page.TasksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Tasks_StepDefinitions  {

        TasksPage tasksPage = new TasksPage();

        @Then("user navigates to the {string} module")
        public void user_navigates_to_the_module(String moduleName) {
                tasksPage.navigateTo(moduleName);
        }

    @And("user types task name to the placeholder which includes \"Add a current task to \"To Do\"...\" message and user hits the enter")
    public void userTypesTaskNameToThePlaceholderWhichIncludesAddACurrentTaskToToDoMessageAndUserHitsTheEnter() {
    }
}
