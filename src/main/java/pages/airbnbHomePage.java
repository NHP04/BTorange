package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class airbnbHomePage extends BasePage {

    // Search Bar
    private static final By LBL_LOCATION = By.xpath("//p[text()='Bạn sắp đi đâu?']");
    private static final By LBL_DATE_RANGE = By.xpath("//p[contains(text(), '2026')]");
    private static final By LBL_ADD_GUEST = By.xpath("//p[text()='Thêm khách']");
    private static final By BTN_SEARCH = By.xpath("//span[@aria-label='search']");

    // Filters
    private static final By BTN_PROPERTY_TYPE = By.xpath("//button[text()='Loại nơi ở']");
    private static final By BTN_PRICE = By.xpath("//button[text()='Giá']");
    private static final By BTN_BOOK_NOW = By.xpath("//button[text()='Đặt ngay']");

    // Locations
    private static final By CARD_HO_CHI_MINH = By.xpath("//h2[text()='Hồ Chí Minh']/ancestor::a");
    private static final By TXT_CAN_THO = By.xpath("//h2[text()='Cần Thơ']");
    private static final By TXT_DRIVE_TIME_NHA_TRANG = By.xpath("//h2[text()='Nha Trang']/following-sibling::p");

    public airbnbHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}