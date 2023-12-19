package MyStore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pop.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

public class MyStoreSteps2Task {
    private WebDriver driver;

    private MyStoreMainPage mainPage;
    private MyStoreLoginPage loginPage;
    private MyStoreAccountPageMyStoreButton accountPageButton;
    private MyStoreSweater sweaterClick;
    private MyStoreSweaterInfo whiteSweater;
    private MyStoreSweaterInfo numberOfSweaters;
    private MyStoreSweaterInfo addToCart;
    private MyStoreSweaterInfo sweaterCheckout;
    private MyStoreSweaterInfo sweaterCheckoutTwo;
    private MyStoreBuyProcess processBuyStepContinue;
    private MyStoreBuyProcess shippingMethodChoose;
    private MyStoreBuyProcess shippingContinue;
    private MyStoreBuyProcess payment;
    private MyStoreBuyProcess conditionClick;
    private MyStoreBuyProcess placeFinalOrder;
    private MyStoreBuyProcess checkAddress;


    @Given("Page {string} opened in the browser")
    public void openPage(String url) {
        driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
        mainPage = new MyStoreMainPage(driver);
        loginPage = new MyStoreLoginPage(driver);
        accountPageButton = new MyStoreAccountPageMyStoreButton(driver);
        sweaterClick = new MyStoreSweater(driver);
        whiteSweater = new MyStoreSweaterInfo(driver);
        numberOfSweaters = new MyStoreSweaterInfo(driver);
        addToCart = new MyStoreSweaterInfo(driver);
        sweaterCheckout = new MyStoreSweaterInfo(driver);
        sweaterCheckoutTwo = new MyStoreSweaterInfo(driver);
        processBuyStepContinue = new MyStoreBuyProcess(driver);
        shippingMethodChoose = new MyStoreBuyProcess(driver);
        shippingContinue = new MyStoreBuyProcess(driver);
        payment = new MyStoreBuyProcess(driver);
        conditionClick = new MyStoreBuyProcess(driver);
        placeFinalOrder = new MyStoreBuyProcess(driver);
        checkAddress = new MyStoreBuyProcess(driver);


    }


    @When("Logged in")
    public void loggedIn() {
        mainPage.clickSignIn();
        loginPage.setEmailField();
        loginPage.setPasswordField();
        loginPage.clickSignIn2();
    }


    @When("Click logo")
    public void clickLogo() {
        accountPageButton.myStoreLogoClick();
    }

    @When("Choose Sweater")
    public void chooseSweater() {
        sweaterClick.sweaterChoose();
    }

    @When("Choose Sweater M")
    public void chooseSweaterM() {
        whiteSweater.sweaterChangeSize();
    }

    @When("Choose Sweater Quantity")
    public void chooseSweaterQuantity() throws InterruptedException {
        numberOfSweaters.sweaterChangeQuantity();
    }

    @When("Click add to cart")
    public void clickAddToCart() {
        addToCart.sweaterAddToCart();
    }

    @When("Click checkout")
    public void clickCheckout() {
        sweaterCheckout.sweaterHummingibirdBuy();
    }

    @When("Proceed to checkout")
    public void proceedToCheckout() {
        sweaterCheckoutTwo.sweaterHummingibirNextStep();
    }

    @When("Buy process address continue")
    public void buyProcessAddressContinue() {
        processBuyStepContinue.sweaterClickContinue();
    }

    @When("Shipping method click")
    public void shippingMethodClick() {
        shippingMethodChoose.sweaterShippingClick();
    }

    @When("Shipping click continue")
    public void shippingClickContinue() {
        shippingContinue.sweaterShippingClickContinue();
    }

    @When("Payment choose")
    public void paymentChoose() {
        payment.paymentPayByCheck();
    }

    @When("Terms and conditions click")
    public void termsAndConditionsClick() {
        conditionClick.termsAndConditionsClick();
    }

    @When("Place order click")
    public void placeOrderClick() {
        placeFinalOrder.sweaterFinalClickPayment();
    }


    @When("Save screenshot hummingbird sweater")
    public void saveScreenshotHummingbirdSweater() throws IOException {
        File tmpScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "MyStoreHummingtonBirdSweater-" + currentDateTime + ".png"));
    }

    @When("Close my browser")
    public void closeMyBrowser() {
        this.driver.quit();
        System.out.println("Browser successfully closed Hurray Hurray!");
    }

    @When("Check address")
    public void checkAddress() {
        checkAddress.checkAddressArray();
    }


    @When("check Discount")
    public void checkDiscount() {whiteSweater.checkDiscount();
    }
}
