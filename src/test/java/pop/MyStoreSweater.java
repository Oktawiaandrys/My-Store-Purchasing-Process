package pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreSweater {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/section/div/div[2]/article/div/div[1]/a/img")
    private WebElement sweaterPicture;

    public MyStoreSweater(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void sweaterChoose() {
        sweaterPicture.click();
    }
}