package pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage { @FindBy(id = "field-email")
private WebElement emailField;

    @FindBy(id = "field-password")
    private WebElement passwordField;

    @FindBy(id = "submit-login")
    private WebElement signIn;

    public MyStoreLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmailField() {
        emailField.sendKeys("iwonaandrys@gmail.com");
    }

    public void setPasswordField() {
        passwordField.sendKeys("Kangur123");
    }

    public void clickSignIn2() {
        signIn.click();
    }
}
