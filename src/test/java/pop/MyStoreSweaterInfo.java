package pop;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class MyStoreSweaterInfo {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[2]")
    private WebElement sweaterHummingibird;

    @FindBy(xpath = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/input")
    private WebElement sweaterHummingibirdQuantity;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement sweaterHummingibirdCart;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement sweaterHummingibirdCheckOut;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement SweaterHummingibirdCheckOutTwo;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement paymentConfirmation;

    @FindBy(css = "#main > div.row.product-container.js-product-container > div:nth-child(2) > div.product-prices.js-product-prices > div.product-price.h5.has-discount > div > span.discount.discount-percentage")
    private WebElement discount;

    public MyStoreSweaterInfo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void sweaterChangeSize() {
        sweaterHummingibird.click();
    }

    public void sweaterChangeQuantity() throws InterruptedException {
        Thread.sleep(200);
        sweaterHummingibirdQuantity.sendKeys(Keys.CONTROL, "a");
//        sweaterHummingibirdQuantity.sendKeys(Keys.DELETE);
        sweaterHummingibirdQuantity.sendKeys("5");


    }

    public void sweaterAddToCart() {
        sweaterHummingibirdCart.click();
    }

    public void sweaterHummingibirdBuy() {
        sweaterHummingibirdCheckOut.click();
    }

    public void sweaterHummingibirNextStep() {
        SweaterHummingibirdCheckOutTwo.click();
    }

    public void checkDiscount() {
        String looked = "SAVE 20%";
        String actual = discount.getText();
        assertEquals(looked, actual);
        if (!actual.contains(looked)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", looked, actual));
        }


    }
}