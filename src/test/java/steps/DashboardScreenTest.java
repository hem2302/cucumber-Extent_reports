package steps;

import org.cucumber.DashboardScreen;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardScreenTest {
	DashboardScreen dashboardTest = new DashboardScreen();
	
	@When ("^I click on Logout$")
	public void I_click_on_Logout() {
		dashboardTest.logout();
	}
	
	@Then ("^I should be able to logout$")
	public void I_should_be_able_to_logout() {
		dashboardTest.verifyLogout();
	}
}
