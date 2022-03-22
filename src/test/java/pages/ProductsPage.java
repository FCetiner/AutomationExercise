package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {
    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsText;

    @FindBy(xpath = "//div[@class='col-sm-4']")
    public List<WebElement> productList;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement firstProductviewProductButton;

    @FindBy(xpath = "//b")
    public List<WebElement> productInformationList;



}
