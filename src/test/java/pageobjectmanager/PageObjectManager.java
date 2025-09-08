package pageobjectmanager;

import com.pageobjectmodel.LoginPage;
//import com.pageobjectmodel.Naukri_Profileupdate;
import com.utility.FileReaderManager;

public class PageObjectManager {
	
	private LoginPage loginpage;
	
	private FileReaderManager fileReader;
	
	//private Naukri_Profileupdate profileupdate;
	
	

	public LoginPage getLoginpage() {
		if(loginpage==null) {
			loginpage=new LoginPage();
		} 
		
		
		return loginpage;
	}



	//public Naukri_Profileupdate Profileupdate() {
	//	if(profileupdate==null) {
	//		profileupdate=new Naukri_Profileupdate();
	//	}
	//	return profileupdate;
	//}
	
	
	
	
	
	public FileReaderManager getFileReader() {
		if (fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}
		
		
		
	

}
