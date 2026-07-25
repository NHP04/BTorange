package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonSearchResultPage {

    // Header & Search
    private static final By TXT_SEARCH_BOX = By.id("twotabsearchtextbox");
    private static final By BTN_CART = By.id("nav-cart");

    // Filters & Info
    private static final By LBL_RESULTS_COUNT = By.xpath("//span[contains(text(), 'results for')]");
    private static final By CHK_GENDER_MEN = By.xpath("//li[@aria-label='Men']//i[contains(@class, 'checkbox')]");
    private static final By BTN_SHOE_SIZE_5_5 = By.xpath("//button[normalize-space()='5.5']");

    // Categories
    private static final By LBL_WOMENS_FOOTWEAR = By.xpath("//span[text()=\"Women's Footwear\"]");
    private static final By LBL_SHOP_TOP_COLLECTIONS = By.xpath("//h2[normalize-space()='Shop top adidas collections']");
    private static final By LBL_BAGS_BACKPACKS = By.xpath("//span[text()='Bags & Backpacks']");

    // Products
    private static final By CARD_WOMENS_GYMNASTICS = By.xpath("//div[@data-component-type='s-search-result' and .//span[contains(text(), \"Women's Gymnastics\")]]");
    private static final By TXT_PRODUCT_TITLE_GYMNASTICS = By.xpath("//span[contains(text(), \"Women's Gymnastics Shoes\")]");
    private static final By TXT_BRAND_ADIDAS_FIRST_ITEM = By.xpath("(//div[@data-component-type='s-search-result']//span[text()='adidas'])[1]");
    private static final By TXT_DELIVERY_DATE = By.xpath("//span[contains(text(), 'Delivery') and contains(text(), 'Dec 9')]");

    // Prices
    private static final By TXT_LIST_PRICE_60 = By.xpath("//span[contains(@class, 'a-text-price') and .//span[contains(text(), '60.00')]]");
    private static final By TXT_ACTUAL_PRICE_72 = By.xpath("//span[@class='a-price' and .//span[text()='72']]");


}