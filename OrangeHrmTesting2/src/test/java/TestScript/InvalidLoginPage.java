package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.LoginPage;

public class InvalidLoginPage extends BaseTest{
	@Test
	public void InvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		Flib f=new Flib();
		int rowCount=f.getRowCount(EXCELPATH,INVALIDSHEET);
		for(int i=0;i<rowCount;i++) {
			String username=f.getDataFromExcelFile(EXCELPATH, INVALIDSHEET, i, 0);
			String password=f.getDataFromExcelFile(EXCELPATH, INVALIDSHEET, i, 1);
			
			LoginPage lp=new LoginPage(driver);
			lp.invalidLogin(username,password);

		}
	}

}
