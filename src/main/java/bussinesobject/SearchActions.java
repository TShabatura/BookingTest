package bussinesobject;

import model.GuestModel;
import model.PeriodModel;
import pageobject.HomePage;

public class SearchActions {
    private HomePage homePage = new HomePage();

    public SearchActions changeLanguageToEng(){
        homePage.clickChangeLanguageBtn()
                .clickEngBtn();
        return this;
    }

    public SearchActions setDestinationPlace(String destination){
        homePage.enterDestination(destination);
        return this;
    }

    public SearchActions setPeriod(PeriodModel period){
        homePage.clickPeriodSelecion()
                .setStartDate(period.getStartDate())
                .setEndDate(period.getEndDate());
        return this;
    }

    public SearchActions setGuests(GuestModel guests){
        homePage.clickGuestsNumberSelection()
                .setAdultsNumber(guests.getAdultsNumber())
                .setChildrenNumber(guests.getChildrenNumber());
        return this;
    }

    public SearchActions clickSearch(){
        homePage.clickSearchBtn();
        return this;
    }
}
