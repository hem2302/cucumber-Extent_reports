package steps;

import org.cucumber.DashboardScreen;
import org.cucumber.LoginScreen;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.SeleniumMethods;


public class LoginScreenTest extends SeleniumMethods {
	LoginScreen loginTest = new LoginScreen();
		
	@Before
	public void before(Scenario sc) {	
		startTestModule(sc.getId(), sc.getName());	
		test = startTestCase(sc.getId());		
	}
	@After
	public void after() {
		closeAllBrowsers();
	}
	
	@Given ("^I launch the (.*)$")
	public void I_launch_the_browser(String browser) {
		loginTest.launchBrowser(browser);
	}
	
	
	@And ("^I pass the (.*)$")
	public void I_pass_the_URL(String URL) {
		loginTest.passURL(URL);
	}
	
	@And ("^I enter (.*) and (.*)$")
    public void I_enter_username_and_password(String uname, String pwd) {
		loginTest.enterUserNameAndPassword(uname, pwd);
	}
	
	@And ("^I click on login$")
	public void I_click_on_login() {
		loginTest.clickLogin();
	}
	
	@And ("I verify it is in Arabic")
	public void I_verify_it_is_in_Arabic() {
		loginTest.verifyArabic();
	}
	
	@And ("^I click on login button$")
	public void I_click_on_login_button() {
		loginTest.clickLoginButton();
	}
	
	@And ("^I click on EN and verify it is translated$")
	public void I_click_on_EN_and_verify_it_is_translated() {
		loginTest.clickEN();
		loginTest.verifyTranslationtoEnglish();
	}
	
	@Then ("^I should be able to login$")
	public void I_should_be_able_to_login() {
		DashboardScreen dashboardTest = new DashboardScreen();
		dashboardTest.checkDashboard();
	}


}
