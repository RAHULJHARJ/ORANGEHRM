package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage extends BaseClass {

	public PIMPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement PimButton;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement AddEmployeButton;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement FirstNameTextField;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-middlename']")
	private WebElement MiddleNameTextField;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	private WebElement LastNameTextField;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement EmployeIdTextField;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement SubmitButton;
	
	public WebElement getPimButton() {
		return PimButton;
	}

	public WebElement getAddEmployeButton() {
		return AddEmployeButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getMiddleNameTextField() {
		return MiddleNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmployeIdTextField() {
		return EmployeIdTextField;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public void PimNewEmploye(String FirstName,String MiddleName,String LastName,String empId) {
		PimButton.click();
		AddEmployeButton.click();
		FirstNameTextField.sendKeys(FirstName);
		MiddleNameTextField.sendKeys(MiddleName);
		LastNameTextField.sendKeys(LastName);
		EmployeIdTextField.sendKeys(empId);
		SubmitButton.click();
		
		
	}
	
	
	
	
	
}
