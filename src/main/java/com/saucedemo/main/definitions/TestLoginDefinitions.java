package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestLoginSteps;
import com.saucedemo.main.util.Constantes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestLoginDefinitions {

    @Steps
    TestLoginSteps testLoginSteps;

    @Given("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        testLoginSteps.openWeb();
    }

    @When("el usuario ingrese las credenciales")
    public void elUsuarioIngreseLasCredenciales() {
        testLoginSteps.ingresarCredenciales(Constantes.USERNAME, Constantes.PASSWORD);

    }

    @When("dar click en el boton de login")
    public void darClickEnElBotonDeLogin() {
        testLoginSteps.darClickBtnLogin();
    }

    @Then("validamos que estemos en la pagina principal {string}")
    public void validamosQueEstemosEnLaPaginaPrincipal(String value) {
        testLoginSteps.validarLogin(value);
    }
}
