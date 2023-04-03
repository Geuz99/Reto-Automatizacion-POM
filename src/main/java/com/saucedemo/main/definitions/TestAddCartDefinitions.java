package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestAddCartSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestAddCartDefinitions {

    @Steps
    TestAddCartSteps testAddCartSteps;

    @Given("^Seleccione un item al carrito de compras$")
    public void seleccione_un_item_al_carrito_de_compras() {
        testAddCartSteps.addItemToCart();
    }

    @When("^ingresamos al carrito de compras$")
    public void ingresamos_al_carrito_de_compras() {
        testAddCartSteps.clickCart();
    }


    @And("Validamos que el producto se encuentre en el carrito {string}")
    public void validamos_que_el_producto_se_encuentre_en_el_carrito(String itemName) {
        testAddCartSteps.validarItemOnCart(itemName);
    }

    @And("^dar click en el boton de check$")
    public void dar_click_en_el_boton_de_check() {
        testAddCartSteps.clickBtnCheck();
    }

    @And("^Validamos estar en la pagina del checkout \"([^\"]*)\"$")
    public void validamos_estar_en_la_pagina_del_checkout_something(String titleInfo) {
        testAddCartSteps.validarInformation(titleInfo);
    }

    @And("^ingresamos nuestros datoe a la aplicacion \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresamos_nuestros_datoe_a_la_aplicacion_something_something_something(String firstName, String lastName, String zip) {
        testAddCartSteps.ingresarInformacion(firstName, lastName, zip);
    }

    @And("^dar click en el boton de continue$")
    public void dar_click_en_el_boton_de_continue() {
        testAddCartSteps.clickContinue();
    }

    @And("^validamos estar en la pagina de checkout overview \"([^\"]*)\"$")
    public void validamos_estar_en_la_pagina_de_checkout_overview_something(String overView) {
        testAddCartSteps.validarOverView(overView);
    }

    @And("^dar click en el boton de finish$")
    public void dar_click_en_el_boton_de_finish() {
        testAddCartSteps.clickFinish();
    }

    @Then("^validamos que estemos en la pagina complete \"([^\"]*)\"$")
    public void validamos_que_estemos_en_la_pagina_complete_something(String complete){
        testAddCartSteps.validarComplete(complete);
    }

}
