package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestReturnLoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class TestReturnLoginDefinitions {

    @Steps
    TestReturnLoginSteps testReturnLoginSteps;

    @Given("dar click en el boton de menu")
    public void darClickEnElBotonDeMenu() {
        testReturnLoginSteps.clickOnMenu();

    }
    @Given("dar click en el logout")
    public void darClickEnElLogout() {
        testReturnLoginSteps.clickOnLogout();
    }
    @Then("validar que estemos en el login {string}")
    public void validarQueEstemosEnElLogin(String loginText) {
        testReturnLoginSteps.validarLogin(loginText);
    }
}
