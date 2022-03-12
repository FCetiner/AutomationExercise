package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.FillinTablePage;

import static org.junit.Assert.assertTrue;

public class FillinInformationStepDefinition {
    FillinTablePage fillinTablePage=new FillinTablePage();
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        fillinTablePage.titleMrRadioButton.click();
        fillinTablePage.passwordTextBox.sendKeys(Faker.instance().internet().password());
        Select selectDays=new Select(fillinTablePage.daysDropdown);
        selectDays.selectByIndex(Faker.instance().random().nextInt(0,29));
        Select selectMonths=new Select(fillinTablePage.monthsDropdown);
        selectMonths.selectByIndex(Faker.instance().random().nextInt(0,11));
        Select selectYears=new Select(fillinTablePage.yearsDropdown);
        selectYears.selectByIndex(Faker.instance().random().nextInt(0,120));
    }
    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        fillinTablePage.newsletterBox.click();
    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        fillinTablePage.receiveOffersBox.click();
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        fillinTablePage.firstnameBox.sendKeys(Faker.instance().funnyName().name());
        fillinTablePage.lastnameBox.sendKeys(Faker.instance().howIMetYourMother().character());
        fillinTablePage.companyBox.sendKeys(Faker.instance().pokemon().name());
        fillinTablePage.address1Box.sendKeys(Faker.instance().address().fullAddress());
        fillinTablePage.address2Box.sendKeys(Faker.instance().address().secondaryAddress());
        Select selectCountry=new Select(fillinTablePage.countryDropdown);
        selectCountry.selectByIndex(Faker.instance().random().nextInt(0,6));
        fillinTablePage.stateBox.sendKeys(Faker.instance().address().state());
        fillinTablePage.cityBox.sendKeys(Faker.instance().address().city());
        fillinTablePage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillinTablePage.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
    }
    @Then("Click Create Account button")
    public void click_create_account_button() {
        fillinTablePage.createAccountButton.click();
    }
    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        assertTrue(fillinTablePage.accountCreatedText.isDisplayed());
    }


}
