package week3.day2homeassignments;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("UserName: Demosalesmanager");
	}
	
	public void enterPassword() {
		System.out.println("Password: crmsfa");
	}

	public static void main(String[] args) {
		LoginTestData data = new LoginTestData();
		data.enterCrendentials();
		data.enterUsername();
		data.enterPassword();
		data.navigateToHomePage();

	}

}
