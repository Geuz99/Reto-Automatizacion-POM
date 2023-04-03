package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestLoginPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLoginSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    TestLoginPage testLoginPage;
    @Page
    HomePage homePage;

    public void openWeb() {
        testLoginPage.open();
    }

    public void ingresarCredenciales(String username, String password) {
        testLoginPage.ingresarCredencialesLogin(username, password);
        GeneralUtil.explicitWait(1000L);

    }

    public void darClickBtnLogin() {
        testLoginPage.clickBtnLogin();
    }

    public void validarLogin(String value) {
        String s = GeneralUtil.formatMessageInformation("validando el login de la aplicacion");
        LOGGER.info(s);
        MatcherAssert.assertThat("se realizo correctamente el login", value.contains(homePage.spanHome.getText()));
    }
}
