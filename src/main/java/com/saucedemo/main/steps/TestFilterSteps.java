package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFilterSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestFilterSteps.class);

    @Page
    HomePage homePage;

    public void darClickFiltro() {
        homePage.clickFiltro();
    }

    public void ordenarPrecio() {
        homePage.seleccionarOrdenPorPrecio();
    }

    public void validarPrecio(String value) {
        String s = GeneralUtil.formatMessageInformation("validando la filtracion precio menor a mayor");
        LOGGER.info(s);
        MatcherAssert.assertThat("se realizo correctamente la filtracion", value.contains(homePage.FiltreText.getText()));
    }
}
