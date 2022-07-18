package com.symund.step_definitions;


import com.symund.page.LoginPage;
import com.symund.page.TasksPage;
import io.cucumber.java.en.Then;

import java.util.Locale;

public class Tasks_StepDefinitions  {

        TasksPage tasksPage = new TasksPage();

        @Then("user navigates to the {string} module")
        public void user_navigates_to_the_module(String moduleName) {
                tasksPage.navigateTo(moduleName);
        }
}
