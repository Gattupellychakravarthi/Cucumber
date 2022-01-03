package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before(order=0)
	public void connectToDB() {
		System.out.println("connect to DataBase");

	}

	@Before(order=1)
	public void LaunchBrowsr() {
		System.out.println("----Open Browser----");

	}

	@Before(order=2)
	public void Login() {
		System.out.println("Login into application");

	}

	@After(order=2)
	public void Logoutapp() {
		System.out.println("Logout from Application");

	}

	@After(order=1)
	public void closeBrowser() {
		System.out.println("---close browser----");

	}

	@After(order=0)
	public void dissconnectToDB() {
		System.out.println("Disconnect with DataBase");

	}

}
