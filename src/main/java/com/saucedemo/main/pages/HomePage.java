package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade spanHome;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElementFacade filtro;

    @FindBy(xpath = "//option[@value='lohi']")
    public WebElementFacade PriceLH;

    @FindBy(xpath = "//span[@class='active_option']")
    public WebElementFacade FiltreText;

        @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    public WebElementFacade btnAddToCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElementFacade btnCart;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElementFacade btnMenu;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    public WebElementFacade btnLogout;

    public void clickFiltro() {
        filtro.click();
    }

    public void seleccionarOrdenPorPrecio() {
        PriceLH.click();
    }

    public void addItem() {
        btnAddToCart.click();
    }

    public void clikOnCart() {
        btnCart.click();
    }

    public void clickMenu() {
        btnMenu.click();
    }

    public void clickLogout() {
        btnLogout.click();
    }
}
