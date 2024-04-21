import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Register Test Senaryoları")
public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Test(description = "Kullanıcı Oluşturma")
    public void userCreate(){
        String username = "testqa"+createRandomNumber(1000000);

        loginPage
                .clickRegister();

        registerPage
                .fillFirstName("TEST QA")
                .fillLastName("QA TEST")
                .fillAddress("Deneme Mah.")
                .fillCity("ISTANBUL")
                .fillState("DENEME")
                .fillZipCode("34000")
                .fillPhone("435435453435")
                .fillSSN("1221312")
                .fillUserName(username)
                .fillPassword("123")
                .fillRepeatedPassword("123")
                .clickRegister();

        homePage.usernameControl("Welcome "+username);
    }

    @Test(description = "Geçerli Kullanıcı Kontrolü")
    public void notValidUser(){

        loginPage
                .clickRegister();

        registerPage
                .fillFirstName("TEST QA")
                .fillLastName("QA TEST")
                .fillAddress("Deneme Mah.")
                .fillCity("ISTANBUL")
                .fillState("DENEME")
                .fillZipCode("34000")
                .fillPhone("435435453435")
                .fillSSN("1221312")
                .fillUserName(username)
                .fillPassword("123")
                .fillRepeatedPassword("123")
                .clickRegister()
                .userNameErrorMessageControl();
    }
}
