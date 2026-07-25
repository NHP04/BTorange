package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hrmAdminPage extends BasePage {

    // Sidebar menu
    private static final By MENU_ADMIN = By.xpath("//span[text()='Admin']");
    private static final By MENU_PIM = By.xpath("//span[text()='PIM']");
    private static final By MENU_LEAVE = By.xpath("//span[text()='Leave']");
    private static final By BTN_TOGGLE_SIDEBAR = By.xpath("//button[contains(@class, 'oxd-main-menu-button')]");

    // Header
    private static final By TOP_HEADER_TITLE = By.xpath("//h6[contains(normalize-space(), 'Admin / User Management')]");
    private static final By TOP_MENU_USER_MANAGEMENT = By.xpath("//span[normalize-space()='User Management ']");

    // Search Form
    private static final By TXT_USERNAME = By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input");
    private static final By DDL_USER_ROLE = By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']");
    private static final By OPTION_ADMIN = By.xpath("//div[@role='listbox']//span[text()='Admin']");
    private static final By OPTION_ESS = By.xpath("//div[@role='listbox']//span[text()='ESS']");
    private static final By TXT_EMPLOYEE_NAME = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input");

    // Search Buttons
    private static final By BTN_RESET = By.xpath("//button[normalize-space()='Reset']");
    private static final By BTN_SEARCH = By.xpath("//button[normalize-space()='Search']");
    private static final By BTN_TOGGLE_SEARCH = By.xpath("//button[.//i[contains(@class, 'oxd-icon bi-caret-up-fill')]]");

    // Data Table
    private static final By BTN_ADD = By.xpath("//button[normalize-space()='Add']");
    private static final By HEADER_USER_ROLE = By.xpath("//div[@role='columnheader' and contains(., 'User Role')]");
    private static final By HEADER_EMPLOYEE_NAME = By.xpath("//div[@role='columnheader' and contains(., 'Employee Name')]");

    // Row Action
    private static final By CHK_BALA22 = By.xpath("//div[contains(text(), 'bala22')]/ancestor::div[@class='oxd-table-row oxd-table-row--with-border']//span[contains(@class, 'oxd-checkbox-input')]");
    private static final By TXT_ROLE_BALA22 = By.xpath("//div[contains(text(), 'bala22')]/parent::div/following-sibling::div[1]/div");
    private static final By BTN_DELETE_BALA22 = By.xpath("//div[contains(text(), 'bala22')]/ancestor::div[@class='oxd-table-row oxd-table-row--with-border']//button[.//i[contains(@class, 'bi-trash')]]");
    private static final By BTN_EDIT_BALA22 = By.xpath("//div[contains(text(), 'bala22')]/ancestor::div[@class='oxd-table-row oxd-table-row--with-border']//button[.//i[contains(@class, 'bi-pencil')]]");

    public hrmAdminPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}