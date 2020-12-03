package test.java.lesson11;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;
import test.java.pages.HomePage;
import test.java.pages.SearchResultPage;
import test.java.utils.PropertyLoader;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class lesson11 extends TestBaseSetup {
    HomePage homePage;
    SearchResultPage searchResultPage;

    @BeforeMethod
    public void pageInitialize() {
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);

    }
    @Test
    public void searchLaptopPage (String brand, String value){
        homePage
                .open()
                .searchInputSubmit(PropertyLoader.loadProperty("laptop"));
        searchResultPage
                .clickSeeMoreLabel()
                .clickCheckBoxes(value);

        List<WebElement> searchBrandList =
                searchResultPage.getResultList();

        for (WebElement brandItem: searchBrandList) {

            String actualSearchBrandResult = brandItem
                    .getText()
                    .toLowerCase();
            assertTrue(actualSearchBrandResult.contains(brand),
                    "Expected result should contain " + brand);

        }
        searchResultPage.clearSelection();
    }


}