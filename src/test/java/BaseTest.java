import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void configuration(){
        Configuration.baseUrl = "https://www.booking.com/";
    }

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        Selenide.open("https://www.booking.com/");
    }
}
