package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    Homepage homepage = new Homepage();
    SearchProductPage searchProductPage = new SearchProductPage();

    @Test
    public void verifyTheColourBeforeAndAfterHover() {
        //homepage.hoverActionOverCategory("Computers");
        homepage.hoverMouseOnComputerAndItsDesktop();
    }

    @Test
    public void verifyTheSearchFunctionalityIsWorking() {

        homepage.searchAnyItem();
        searchProductPage.toGetAllTheSearchedItem();

    }

}

