package test.java.utils;

import org.testng.annotations.DataProvider;

public class DPSource {
    @DataProvider
    public Object[][] dataProvider(){
        return new Object[][]{
                {"hp", "//li[@id=\"p_89/HP\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"acer", "//li[@id=\"p_89/Acer\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"asus", "//li[@id=\"p_89/ASUS\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"lenovo", "//li[@id=\"p_89/Lenovo\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"dell", "//li[@id=\"p_89/Dell\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"microsoft", "//li[@id=\"p_89/Microsoft\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"apple", "//li[@id=\"p_89/Apple\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"chuwi", "//li[@id=\"p_89/CHUWI\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"lg", "//li[@id=\"p_89/LG\"]//i[@class=\"a-icon a-icon-checkbox\"]"},
                {"jumper", "//li[@id=\"p_89/jumper\"]//i[@class=\"a-icon a-icon-checkbox\"]"}
        };
    }

}