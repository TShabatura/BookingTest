package bussinesobject;

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

    public SearchActions setPeriod(){
        homePage.clickPeriodSelecion()
                .setStartDate()
                .setEndDate();
        return this;
    }

    public SearchActions setGuests(int adultsNumber, int childrenNumber){
        homePage.clickGuestsNumberSelection()
                .setAdultsNumber(adultsNumber)
                .setChildrenNumber(childrenNumber);
        return this;
    }

    public SearchActions clickSearch(){
        homePage.clickSearchBtn();
        return this;
    }
}
