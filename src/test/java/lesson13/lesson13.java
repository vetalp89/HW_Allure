package test.java.lesson13;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;
import test.java.pages.HomePage;
import test.java.pages.SearchResultPage;
import test.java.utils.PropertyLoader;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class lesson13 extends TestBaseSetup {
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

        int max = searchBrandList.size() - 1;
        int min = 0;
        int randI = (int)(Math.random() * (max - min + 1)) + min;
        String brandItem = searchBrandList.get(randI).getText().toLowerCase();
        assertTrue (brandItem.contains(brand));
        searchResultPage.clearSelection();
    }

}
