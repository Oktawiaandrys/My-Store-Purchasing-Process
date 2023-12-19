package pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAccountPageMyStoreButton {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"_desktop_logo\"]/a/img")
    private WebElement myStoreLogo;

    public MyStoreAccountPageMyStoreButton(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void myStoreLogoClick() {
        myStoreLogo.click();
    }
}