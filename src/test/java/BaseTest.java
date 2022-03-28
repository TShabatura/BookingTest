import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    @BeforeSuite
    public void configuration(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        Selenide.open("https://www.booking.com/");
    }

    @AfterMethod
    public void deleteAllCookies(){
        getWebDriver().quit();
    }
}
