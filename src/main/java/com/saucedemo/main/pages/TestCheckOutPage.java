package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class TestCheckOutPage extends PageObject {

    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade InfoText;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElementFacade inputFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElementFacade inputLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElementFacade inputPostalCode;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElementFacade btnContinue;

    public void ingresarInfo(String firstName, String lastName, String zip) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputPostalCode.sendKeys(zip);
    }

    public void clickBtnContinue() {
        btnContinue.click();
    }
}
