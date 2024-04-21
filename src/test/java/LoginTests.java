import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Login Test Senaryoları")
public class LoginTests extends BaseTest
{
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    HomePage homePage = new HomePage();

    @Test(description = "TC0001")
    public void failUserTEST(){

        loginPage
                .fillUsername("TEST QA")
                .fillPassword("TEST")
                .clickLogin();

        mainPage
                .errorMessageControl(errorMessage1);
    }

    @Test(description = "TC0002")
    public void failPasswordTEST(){
        loginPage
                .fillUsername("TEST QA")
                .clickLogin();

        mainPage
                .errorMessageControl2(errorMessage2);
    }

    @Test(description = "Boş Veri Testi")
    public void noneDataTEST(){

        loginPage
                .fillUsername("")
                .fillPassword("")
                .clickLogin();

        mainPage
                .errorMessageControl2(errorMessage2);
    }

    @Test(description = "En Az Karakter Testi")
    public void minimumCharTEST(){

        loginPage
                .fillUsername("1")
                .fillPassword("1")
                .clickLogin();

        mainPage
                .errorMessageControl2(errorMessage1);
    }

    @Test(description = "En Fazla Karakter Testi")
    public void maxCharTEST(){

        loginPage
                .fillUsername("2319823918892389821892189983218321213892323198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923")
                .fillPassword("2319823918892389821892189983218321213892323198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923")
                .clickLogin();

        mainPage
                .errorMessageControl2(errorMessage1);
    }

    @Test(description = "Başarılı Kullanıcı Giriş Testi")
    public void successTEST(){

        loginPage
                .fillUsername(username)
                .fillPassword(password)
                .clickLogin();

        homePage
                .pageControl("Accounts Overview");

    }
}
