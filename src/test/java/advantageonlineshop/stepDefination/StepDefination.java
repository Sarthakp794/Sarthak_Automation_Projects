package advantageonlineshop.stepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import advantageonlineshop.pageobjects.ConfirmationPage;
import advantageonlineshop.pageobjects.Indexpage;
import advantageonlineshop.pageobjects.MyAccount;
import advantageonlineshop.pageobjects.OrderPayment;
import advantageonlineshop.pageobjects.Productpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseClass;


public class StepDefination extends BaseClass {

    private Indexpage indexpage;
    private MyAccount myaccount;
    private Productpage productpage;
    private OrderPayment orderpayment;
    private ConfirmationPage confirmationpage;

    @Given("I landed on Ecommerce Page")
    public void I_landed_on_Ecommerce_Page() throws InterruptedException {
    	driver= new ChromeDriver();
        indexpage = new Indexpage(driver);
        indexpage.userloginclick();
    }

    @Given("^Logged in with username (.+) and password (.+)$")
    public void logged_in_username_and_password(String username, String password) {
        myaccount = new MyAccount(driver);
        myaccount.enterUsername(username);
        myaccount.enterPassword(password);
        myaccount.clickSignInButton();
        myaccount.isSpeakerImageDisplayed();
        myaccount.clickBoseSpeaker();
    }

    @When("^I add product (.+) to Cart$")
    public void i_add_product_to_cart(String productName) throws InterruptedException {
        productpage = new Productpage(driver);
        productpage.getSearchResultProductName();
        productpage.increaseQuantity();
        productpage.addtoCart();
        productpage.checkoutPopup();
    }

    @When("^Checkout (.+) and submit the order$")
    public void checkout_submit_order(String productName) {
        orderpayment = new OrderPayment(driver);
        orderpayment.nextButton1();
        orderpayment.payNowbutton();
    }

    @Then("{string} message is displayed on ConfirmationPage")
    public void message_displayed_confirmationPage(String expectedMessage) {
        confirmationpage = new ConfirmationPage(driver);
        String actualMessage = confirmationpage.getConfirmationMessage();

        if (actualMessage.equalsIgnoreCase(expectedMessage)) {
            System.out.println(" Order confirmation message verified: " + actualMessage);
        } else {
            System.out.println("Expected: " + expectedMessage + " | Found: " + actualMessage);
        }

     
    }
}