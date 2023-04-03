package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class TestCartPage extends PageObject {
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElementFacade ItemText;

    @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button']")
    public WebElementFacade btnCheckOut;


    public void clickBtnCheck() {
        btnCheckOut.click();
    }
}
