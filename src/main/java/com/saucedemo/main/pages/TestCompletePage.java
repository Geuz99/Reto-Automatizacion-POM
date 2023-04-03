package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class TestCompletePage extends PageObject {
    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade CompleteText;
}
