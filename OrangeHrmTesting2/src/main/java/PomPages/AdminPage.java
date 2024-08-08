package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BaseClass {

	public AdminPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	private WebElement AdminButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement AddAdminButton;

	@FindBy(xpath = "//div[@class='oxd-select-text-input'][1]")
	private WebElement UserRoleDropDown;

	@FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
	private WebElement selectDropDown;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement EmployeNameTextField;

	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	private WebElement StatusDropDown;
	
	@FindBy(xpath = "//div[@role='listbox']//span[text()='Enabled']")
	private WebElement SelectDropdow2;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement UserNameTextField;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement PasswordTextField;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement SubmitButton;

	public WebElement getAdminButton() {
		return AdminButton;
	}

	public WebElement getAddAdminButton() {
		return AddAdminButton;
	}

	public WebElement getUserRoleDropDown() {
		return UserRoleDropDown;
	}

	public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getEmployeNameTextField() {
		return EmployeNameTextField;
	}

	public WebElement getStatusDropDown() {
		return StatusDropDown;
	}
	
	public WebElement getSelectDropdow2() {
		return SelectDropdow2;
	}

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public void AddNewEmployee(String employeeName,String username,String password,String confirmPassword) throws InterruptedException {

		AdminButton.click();
		AddAdminButton.click();
		UserRoleDropDown.click();
		Thread.sleep(2000);
		selectDropDown.click();
        EmployeNameTextField.sendKeys(employeeName);
        StatusDropDown.click();
        Thread.sleep(2000);
        SelectDropdow2.click();
        Thread.sleep(2000);
        UserNameTextField.sendKeys(username);
        PasswordTextField.sendKeys(password);
        ConfirmPassword.sendKeys(confirmPassword);
        SubmitButton.click();
	}
}
