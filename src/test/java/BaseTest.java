import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeSuite
    public void configuration(){
        Configuration.baseUrl = "https://www.booking.com/";
    }
}
