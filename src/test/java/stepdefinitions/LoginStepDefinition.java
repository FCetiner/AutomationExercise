package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;

import java.util.List;

public class LoginStepDefinition {
    LoginPage loginPage=new LoginPage();

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> loginCredintals=dataTable.row(1);
        loginPage.emailBox.sendKeys(loginCredintals.get(0));
        loginPage.passwordBox.sendKeys(loginCredintals.get(1));
    }

    @Then("Click login button")
    public void click_login_button() {
    loginPage.loginButton.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
       Assert.assertTrue(loginPage.deleteAccountText.isDisplayed());
    }
}
