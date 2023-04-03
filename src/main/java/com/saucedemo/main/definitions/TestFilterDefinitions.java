package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestFilterSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestFilterDefinitions {

    @Steps
    TestFilterSteps testFilterSteps;

    @Given("dar click en el boton de filtracion")
    public void darClickEnElBotonDeFiltracion() {
        testFilterSteps.darClickFiltro();
    }

    @When("el usuario seleccione ordenar precio menor a mayor")
    public void elUsuarioSeleccioneOrdenarPrecioMenorAMayor() {
        testFilterSteps.ordenarPrecio();
    }

    @Then("validamos que los precios si esten ordenados segun su precio {string}")
    public void validamosQueLosPreciosSiEstenOrdenadosSegunSuPrecio(String value1) {
        testFilterSteps.validarPrecio(value1);
    }

}
