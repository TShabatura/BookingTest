package bussinesobject;

import io.qameta.allure.Step;
import model.GuestModel;
import model.PeriodModel;
import pageobject.HomePage;

public class SearchActions {
    private HomePage homePage = new HomePage();

    @Step
    public SearchActions changeLanguageToEng(){
        homePage.clickChangeLanguageBtn()
                .clickEngBtn();
        return this;
    }

    @Step
    public SearchActions setDestinationPlace(String destination){
        homePage.enterDestination(destination);
        return this;
    }

    @Step
    public SearchActions setPeriod(PeriodModel period){
        homePage.clickPeriodSelecion()
                .setStartDate(period.getStartDate())
                .setEndDate(period.getEndDate());
        return this;
    }

    @Step
    public SearchActions setGuests(GuestModel guests){
        homePage.clickGuestsNumberSelection()
                .setAdultsNumber(guests.getAdultsNumber())
                .setChildrenNumber(guests.getChildrenNumber());
        return this;
    }

    @Step
    public SearchActions clickSearch(){
        homePage.clickSearchBtn();
        return this;
    }
}
