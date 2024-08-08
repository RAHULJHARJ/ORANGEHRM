package TestScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.LoginPage;
import PomPages.PIMPage;

public class PimNewEmploye extends BaseTest {

	@Test
	public void NewEmploye() throws EncryptedDocumentException, IOException, InterruptedException {
		Flib f = new Flib();
		String username = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 0);
		String password = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		
		String firstName = f.getDataFromExcelFile(EXCELPATH, NewEmpSHEET, 1, 0);
		String middleName = f.getDataFromExcelFile(EXCELPATH, NewEmpSHEET, 1, 1);
		String lastName = f.getDataFromExcelFile(EXCELPATH, NewEmpSHEET, 1, 2);
		String empId = f.getDataFromExcelFile(EXCELPATH, NewEmpSHEET, 1, 3);
		PIMPage ne = new PIMPage(driver);
		ne.PimNewEmploye(firstName, middleName, lastName, empId);
	}
}
