package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTimeStamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
    }

    public static void waitForElementToBeClickable(By by, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForElementToBeVisible(By by, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForUrlToBe(String url, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select selectText = new Select(driver.findElement(by));
        selectText.selectByVisibleText(text);
    }

    public static void selectFromDropDownByValue(By by, String value) {
        Select selectValue = new Select(driver.findElement(by));
        selectValue.selectByValue(value);
    }

    public static void selectFromDropDownBYIndex(By by, int index) {
        Select selectIndex = new Select(driver.findElement(by));
        selectIndex.selectByIndex(index);
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
}