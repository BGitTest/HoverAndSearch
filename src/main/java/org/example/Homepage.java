package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class Homepage extends Utils {
    private By _Computer = By.linkText("Computers");
    private By _DesktopsSubMenu = By.linkText("Desktops");
    private By _SearchBox = By.id("small-searchterms");
    private String searchTheItem = LoadProp.getProperty("Text");

    private By _SubmitSearch = By.xpath("//button[@class='button-1 search-box-button']");

    public void hoverMouseOnComputerAndItsDesktop() {
        Actions actions = new Actions(driver);
        WebElement computerEle = driver.findElement(_Computer);
        String computerColor = computerEle.getCssValue("color");
        System.out.println("Computer colour before hover: " + computerColor);
        actions.moveToElement(computerEle).perform();
        String afterHoverComputer = computerEle.getCssValue("color");
        System.out.println("Computer color after hover: " + afterHoverComputer);
        Assert.assertNotEquals(computerColor, "Expected color matched");
        WebElement desktopEle = driver.findElement(_DesktopsSubMenu);
        String desktopColor = desktopEle.getCssValue("background-color");
        System.out.println("Desktops color before hover: " + desktopColor);
        actions.moveToElement(desktopEle).perform();
        String afterHoverDesktop = desktopEle.getCssValue("color");
        System.out.println("Desktops color after hover: " + afterHoverDesktop);
        Assert.assertNotEquals(desktopColor, afterHoverDesktop, "Background color matched");
    }

    public void searchAnyItem() {
        typeText(_SearchBox, searchTheItem);
        clickOnElement(_SubmitSearch);
    }

}





