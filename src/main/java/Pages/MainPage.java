package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTest {

    By lblErrorMessage1 = By.xpath("//*[@id=\"rightPanel\"]/p");
    By lblErrorMessage2 = By.cssSelector("[class='error']");

    @Step("1.Hata Mesajı Görüntülenir: {errorMessage}")
    public MainPage errorMessageControl(String errorMessage){
        String text = driver.findElement(lblErrorMessage1).getText();

        Assert.assertEquals(text, errorMessage);
        return this;
    }
    @Step("2.Hata Mesajı Görüntülenir: {errorMessage}")
    public MainPage errorMessageControl2(String errorMessage){
        String text = driver.findElement(lblErrorMessage2).getText();

        Assert.assertEquals(text, errorMessage);
        return this;
    }
}
