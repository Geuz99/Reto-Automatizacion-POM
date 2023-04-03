package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestLoginPage;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class TestReturnLoginSteps {

    @Page
    HomePage homePage;

    @Page
    TestLoginPage testLoginPage;

    public void clickOnMenu() {
        homePage.clickMenu();
    }

    public void clickOnLogout() {
        homePage.clickLogout();
    }

    public void validarLogin(String loginText) {
        MatcherAssert.assertThat("Se realizo correctamente el paso a ingresar nuestr informacion", loginText.contains(testLoginPage.LoginText.getAttribute("class")));

    }
}
