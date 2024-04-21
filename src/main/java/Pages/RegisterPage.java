package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BaseTest {

    By txtFirstName = By.id("customer.firstName");
    By txtLastName = By.id("customer.lastName");
    By txtAddress = By.id("customer.address.street");
    By txtCity = By.id("customer.address.city");
    By txtState = By.id("customer.address.state");
    By txtZipCode = By.id("customer.address.zipCode");
    By txtPhoneNumber = By.id("customer.phoneNumber");
    By txtSSN = By.id("customer.ssn");
    By txtUserName = By.id("customer.username");
    By lblErrorUserName = By.id("customer.username.errors");
    By txtPassword = By.id("customer.password");
    By txtRepeatedPassword = By.id("repeatedPassword");
    By btnRegister = By.cssSelector("[value='Register']");

    @Step("First name alanı doldurulur. :{text}")
    public RegisterPage fillFirstName(String text){
        driver.findElement(txtFirstName).sendKeys(text);
        return this;
    }
    @Step("Last name alanı doldurulur. :{text}")
    public RegisterPage fillLastName(String text){
        driver.findElement(txtLastName).sendKeys(text);
        return this;
    }
    @Step(" adress alanı doldurulur. :{text}")
    public RegisterPage fillAddress(String text){
        driver.findElement(txtAddress).sendKeys(text);
        return this;
    }

    @Step("city  alanı doldurulur. :{text}")
    public RegisterPage fillCity(String text){
        driver.findElement(txtCity).sendKeys(text);
        return this;
    }
    @Step("state alanı doldurulur. :{text}")
    public RegisterPage fillState(String text){
        driver.findElement(txtState).sendKeys(text);
        return this;
    }

    @Step("Zip code alanı doldurulur. :{text}")
    public RegisterPage fillZipCode(String text){
        driver.findElement(txtZipCode).sendKeys(text);
        return this;
    }

    @Step("phone alanı doldurulur. :{text}")
    public RegisterPage fillPhone(String text){
        driver.findElement(txtPhoneNumber).sendKeys(text);
        return this;
    }

    @Step("SSN alanı doldurulur. :{text}")
    public RegisterPage fillSSN(String text){
        driver.findElement(txtSSN).sendKeys(text);
        return this;
    }

    @Step("User name alanı doldurulur. :{text}")
    public RegisterPage fillUserName(String text){
        driver.findElement(txtUserName).sendKeys(text);
        return this;
    }

    @Step("user name error message  :{text}")
    public RegisterPage userNameErrorMessageControl(){
       boolean status = driver.findElement(lblErrorUserName).isDisplayed();
        Assert.assertTrue(status);
        return this;
    }

    @Step("Password alanı doldurulur. :{text}")
    public RegisterPage fillPassword(String text){
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }

    @Step("Repeated password doldurulur. :{text}")
    public RegisterPage fillRepeatedPassword(String text){
        driver.findElement(txtRepeatedPassword).sendKeys(text);
        return this;
    }

    @Step("Register tıklanır.")
    public RegisterPage clickRegister(){
        driver.findElement(btnRegister).click();
        return this;
    }
}
