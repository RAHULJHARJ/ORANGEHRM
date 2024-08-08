package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage extends BaseClass {

    public LeavePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
    private WebElement LeaveButton;

    @FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")
    private WebElement ApplyLeaveButton;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement LeaveTypeDropdown;

    @FindBy(xpath = "//span[text()='CAN - FMLA']\r\n")
    private WebElement CANFMLAOption;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
    private WebElement FromDateDropDown;

    @FindBy(xpath = "(//div[@class='oxd-calendar-date'])[11]")
    private WebElement SelectFromDateOption;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
    private WebElement ToDateDropDown;

    @FindBy(xpath = "(//div[@class='oxd-calendar-date'])[20]")
    private WebElement SelectToDateOption;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    private WebElement CommentTextArea;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement SubmitButton;

	public void ApplyForLeave() throws InterruptedException {
        LeaveButton.click();
        ApplyLeaveButton.click();
        LeaveTypeDropdown.click();
        Thread.sleep(2000);
        CANFMLAOption.click();
        
        
        Thread.sleep(3000);
        FromDateDropDown.click();
        Thread.sleep(3000);
        SelectFromDateOption.click();
        Thread.sleep(3000);
        
        ToDateDropDown.click();
        Thread.sleep(3000);
        SelectToDateOption.click(); 
        Thread.sleep(3000);
        
        CommentTextArea.sendKeys("I need leave because I want leave.");
        Thread.sleep(3000);
        SubmitButton.click();
        Thread.sleep(3000);
    }
}


