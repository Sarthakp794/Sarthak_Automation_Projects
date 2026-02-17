package TestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.ClientsPage;
import com.pages.LoginPage;
import com.pages.ProductPage;

import utils.ExtentReport;
public class SleekBillTest extends com.pages.Baseclass {
@Test
public void LogTest() {
	ExtentReport.test =
	        ExtentReport.extent.createTest("Login Test");
	
LoginPage lp= new LoginPage(driver);
lp.usrmethod("sales@sleekbill.in");
lp.passmethod("Test1@sleekbill");
lp.signin();
}

@Test(enabled=false)
public void ClientTest() {
ClientsPage client= new ClientsPage(driver);
client.clientbuton();
client.GSTINFieleddmethod("27AAFCV2449G1Z7");
String actualTitle = driver.getTitle();
System.out.println(actualTitle);
}

@Test
public void ProductTest() {
ProductPage product= new ProductPage(driver);
product.item();
product.newProduct();
product.enterName("Redmi Laptop");
product.enterOpeningQuantity("50");
product.enterHSN("673733");
product.SaveButton();
//product.selectTax();

}
}