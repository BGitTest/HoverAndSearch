package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchProductPage extends Utils {
    private By _SearchedProducts = By.xpath("//h2[@class='product-title']");
    private String searchTheItem = LoadProp.getProperty("Text");

    public void toGetAllTheSearchedItem() {
        List<WebElement> productList = driver.findElements(_SearchedProducts);
        for (WebElement items : productList) {
            System.out.println(items.getText());
            Assert.assertTrue(items.getText().toLowerCase().contains(searchTheItem.toLowerCase()), "Searched items are different");
        }

    }
}

