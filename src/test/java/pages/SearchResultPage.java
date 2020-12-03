package test.java.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class SearchResultPage {
    private Logger logger = LogManager.getLogger(SearchResultPage.class);
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(xpath = "(//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'])[3]//*[@class='a-icon a-icon-checkbox']")
    public List <WebElement> checkBoxesBrand;
    @FindBy(xpath = "(//i[@class='a-icon a-icon-extender-expand'])[2]")
    public WebElement clickSeeMore;
    @FindBy(xpath = "(//span[@class='a-size-base a-color-base'])[6]")
    public WebElement clearCheckBox;


    By selectAppleCheckBoxBy = By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]");
    By searchResultBy = By.xpath("//div[@data-component-type='s-search-result']");
    By searchItemsListBy = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");


    public SearchResultPage(WebDriver driver){
        logger.trace("SEARCH RESULT PAGE was initialized");
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
        PageFactory.initElements(driver, this);
    }
    public SearchResultPage selectAppleBoxBtn(){
        logger.info("Select Apple checkbox");
        wait.until(ExpectedConditions.elementToBeClickable(selectAppleCheckBoxBy));
        driver.findElement(selectAppleCheckBoxBy).click();
        return this;
    }
    public SearchResultPage clickSeeMoreLabel(){
        logger.info("Click to expand checkbox list");
        wait.until(ExpectedConditions.elementToBeClickable(clickSeeMore));
        clickSeeMore.click();
        return this;
    }
    public SearchResultPage clearSelection(){
        logger.info("Clear selected checkbox");
        wait.until(ExpectedConditions.elementToBeClickable(clearCheckBox));
        clearCheckBox.click();
        return this;
    }
    public SearchResultPage clickCheckBoxes(String value){
        logger.info("Click proper checkbox");
        logger.warn("WARN: problem with checkbox");
        logger.debug("DEBUG: Click proper checkbox");
        WebElement brandName =
                driver.findElement(By.xpath(value));
        brandName.click();
        return this;
    }

    public List<WebElement> getResultList (){
        logger.info("Get search result");
        return driver.findElements(searchResultBy);
    }
    public String getNameItem(WebElement searchItem){
        logger.info("Find name of " + searchItem);
        logger.error("ERROR: something goes wrong");
        List<WebElement> searchItemList = searchItem.findElements(searchItemsListBy);
        searchItemList.toString();
        String actualSearchNameItem = searchItem.getText();
        return actualSearchNameItem;
    }
}
