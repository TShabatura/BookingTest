import assertions.ResultAssertions;
import bussinesobject.SearchActions;
import model.GuestModel;
import model.PeriodModel;
import org.testng.annotations.Test;
import pageobject.SearchResultsPage;
import service.GuestCreator;
import service.PeriodCreator;

public class BookingTest extends BaseTest{

    private String destinationPlace = "Paris";

    @Test
    public void searchParisTest(){
        SearchActions searchActions = new SearchActions();

        PeriodModel period = PeriodCreator.withTwoNextDays();
        GuestModel guests = GuestCreator.standart();
        searchActions.changeLanguageToEng()
                .setDestinationPlace(destinationPlace)
                .setPeriod(period)
                .setGuests(guests)
                .clickSearch();
        new SearchResultsPage().selectResultByNumber(0);

        ResultAssertions.assertThat()
                .hasLocation(destinationPlace);
    }

    @Test
    public void failedSearchParisTest(){
        SearchActions searchActions = new SearchActions();

        PeriodModel period = PeriodCreator.withTwoNextDays();
        GuestModel guests = GuestCreator.standart();
        searchActions.changeLanguageToEng()
                .setDestinationPlace(destinationPlace)
                .setPeriod(period)
                .setGuests(guests)
                .clickSearch();
        new SearchResultsPage().selectResultByNumber(0);

        ResultAssertions.assertThat()
                .hasLocation("Париж");
    }
}
