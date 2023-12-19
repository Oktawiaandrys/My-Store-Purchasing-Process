package pop;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class MyStoreBuyProcess {
    private WebDriver driver;

    @FindBy(css = "#id-address-delivery-address-5917 > header > label > div")
    private WebElement checkAddressField;

    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span/span")
    private WebElement shippingButton;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement continueButtonShipment;

    @FindBy(xpath = "//*[@id=\"payment-option-1\"]")
    private WebElement paymentOption;

    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    private WebElement termsAndConditionBox;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement paymentConfirmation;

    public MyStoreBuyProcess(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    public void checkAddressArray() {
        String looked = "Oktawia Andrys\n" +
                "185 Wilmslow Rd\n" +
                "Manchester\n" +
                "M14 5AP\n" +
                "United Kingdom";
        String actual = checkAddressField.getText();
        assertEquals(looked, actual);
        if (!actual.contains(looked)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", looked, actual));

        }
    }

    public void sweaterClickContinue() {
        continueButton.click();
    }
    public void sweaterShippingClick(){shippingButton.click();}

    public void sweaterShippingClickContinue(){continueButtonShipment.click();}

    public void paymentPayByCheck(){paymentOption.click();}

    public void termsAndConditionsClick(){termsAndConditionBox.click();}

    public void sweaterFinalClickPayment(){paymentConfirmation.click();}

}

