import assertions.ResultAssertions;
import bussinesobject.SearchActions;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.SearchResultsPage;

public class BookingTest extends BaseTest{
    @BeforeMethod
    public void setup(){
        Selenide.open("https://www.booking.com/");
    }
    @Test
    public void searchParisTest(){
        SearchActions searchActions = new SearchActions();

        searchActions.changeLanguageToEng()
                .setDestinationPlace("Paris")
                .setPeriod()
                .setGuests(2, 0)
                .clickSearch();
        new SearchResultsPage().selectResultByNumber(0);

        ResultAssertions.assertThat()
                .hasLocation("Paris");
    }
}
