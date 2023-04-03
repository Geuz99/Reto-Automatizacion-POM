package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class TestOverViewPage extends PageObject {
    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade OverViewText;

    @FindBy(xpath = "//button[@id='finish']")
    public WebElementFacade btnFinish;

    public void clickFinish() {
        btnFinish.click();
    }
}
