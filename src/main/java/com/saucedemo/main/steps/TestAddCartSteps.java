package com.saucedemo.main.steps;

import com.saucedemo.main.pages.*;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestAddCartSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestAddCartSteps.class);

    @Page
    HomePage homePage;

    @Page
    TestCartPage cartPage;

    @Page
    TestCheckOutPage checkOutPage;

    @Page
    TestOverViewPage overViewPage;

    @Page
    TestCompletePage completePage;

    public void addItemToCart() {
        homePage.addItem();
    }

    public void clickCart() {
        homePage.clikOnCart();
    }

    public void validarItemOnCart(String itemName) {
        MatcherAssert.assertThat("Producto en el carrito!", itemName.contains(cartPage.ItemText.getText()));
    }

    public void clickBtnCheck() {
        cartPage.clickBtnCheck();
    }

    public void validarInformation(String titleInfo) {
        MatcherAssert.assertThat("Se realizo correctamente el paso a ingresar nuestr informacion", titleInfo.contains(checkOutPage.InfoText.getText()));
    }

    public void ingresarInformacion(String firstName, String lastName, String zip) {
        checkOutPage.ingresarInfo(firstName, lastName, zip);
    }

    public void clickContinue() {
        checkOutPage.clickBtnContinue();
    }

    public void validarOverView(String overView) {
        MatcherAssert.assertThat("Se realizo correctamente el paso al overview", overView.contains(overViewPage.OverViewText.getText()));
    }

    public void clickFinish() {
        overViewPage.clickFinish();
    }

    public void validarComplete(String complete) {
        MatcherAssert.assertThat("Se realizo correctamente la compra", complete.contains(completePage.CompleteText.getText()));
    }
}
