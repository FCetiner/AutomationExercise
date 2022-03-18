package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginYourAccountText;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[.='Delete Account']")
    public WebElement deleteAccountText;

    @FindBy(xpath = "(//p)[1]")
    public WebElement negativeLoginText;

    @FindBy(xpath = "//a[contains(text(),' Logout')]")
    public WebElement logoutButton;


}
