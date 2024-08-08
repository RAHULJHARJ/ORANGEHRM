package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.AdminPage;
import PomPages.LoginPage;

public class AddNewEmployePage extends BaseTest {

    @Test
    public void AddEmploye() throws EncryptedDocumentException, IOException, InterruptedException {
        Flib f = new Flib();
        String username = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 0);
        String password = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 1);
        LoginPage lp = new LoginPage(driver);
        lp.validLogin(username, password);
        
        String employeeName = f.getDataFromExcelFile(EXCELPATH, ADDNEWEMP, 1, 0);
//        String status = f.getDataFromExcelFile(EXCELPATH, ADDNEWEMP, 1, 2);
//        String userName = f.getDataFromExcelFile(EXCELPATH, ADDNEWEMP, 1, 3);
//        String empPassword = f.getDataFromExcelFile(EXCELPATH, ADDNEWEMP, 1, 4);
//        String confirmPassword = f.getDataFromExcelFile(EXCELPATH, ADDNEWEMP, 1, 5);

        AdminPage ad = new AdminPage(driver);
        ad.AddNewEmployee(employeeName, username, password, password);
    }
}
