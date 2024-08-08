package TestScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.LeavePage;
import PomPages.LoginPage;

public class ApplyForLeave extends BaseTest {
    @Test
    public void EmployeLeave() throws EncryptedDocumentException, IOException, InterruptedException {
        Flib f = new Flib();
        String username = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 0);
        String password = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 1);
        LoginPage lp = new LoginPage(driver);
        lp.validLogin(username, password);
        
        LeavePage leavePage = new LeavePage(driver);
        leavePage.ApplyForLeave();
    }
}
