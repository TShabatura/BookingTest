package pageobject;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage{
    private static final String CHANGE_LANGUAGE_XPATH = "//button[@data-modal-id = 'language-selection']";
    private static final String ENG_XPATH = "//a[@data-lang = 'en-us']";
    private static final String SEARCH_XPATH = "//input[@type = 'search']";
    private static final String DATES_XPATH = "//div[@class = 'xp__dates xp__group']";
    private static final String START_DATE_XPATH = "//td[@data-date = '2022-02-13']";
    private static final String END_DATE_XPATH = "//td[@data-date = '2022-02-15']";
    private static final String ADULTS_XPATH = "//input[@id = 'group_adults']";
    private static final String CHILDREN_XPATH = "//input[@id = 'group_children']";
    private static final String GUESTS_XPATH = "//div[@class = 'xp__input-group xp__guests']";
    private static final String SEARCH_BTN_XPATH = "//button[@data-sb-id = 'main']";
    private static final String INCREASE_ADULTS_BTN_XPATH = "//button[@aria-label = 'Increase number of Adults']";
    private static final String DECREASE_ADULTS_BTN_XPATH = "//button[@aria-label = 'Decrease number of Adults']";
    private static final String INCREASE_CHILDREN_BTN_XPATH = "//button[@aria-label = 'Increase number of Children']";
    private static final String DECREASE_CHILDREN_BTN_XPATH = "//button[@aria-label = 'Decrease number of Children']";

    public HomePage clickChangeLanguageBtn(){
        $x(CHANGE_LANGUAGE_XPATH).click();
        return this;
    }

    public HomePage clickEngBtn(){
        $x(ENG_XPATH).click();
        return this;
    }

    public HomePage enterDestination(String destination){
        $x(SEARCH_XPATH).sendKeys(destination);
        return this;
    }

    public HomePage clickPeriodSelecion(){
        $x(DATES_XPATH).click();
        return this;
    }

    public HomePage setStartDate(){
        $x(START_DATE_XPATH).click();
        return this;
    }

    public HomePage setEndDate(){
        $x(END_DATE_XPATH).click();
        return this;
    }

    public HomePage clickGuestsNumberSelection(){
        $x(GUESTS_XPATH).click();
        return this;
    }

    public HomePage setAdultsNumber(int number){
        int actualNumber = Integer.parseInt($x(ADULTS_XPATH).getValue());
        if(actualNumber < number){
            for(int i = 0; i < number-actualNumber; i++){
                $x(INCREASE_ADULTS_BTN_XPATH).click();
            }
        }
        else if(actualNumber > number){
            for(int i = 0; i < actualNumber-number; i++){
                $x(DECREASE_ADULTS_BTN_XPATH).click();
            }
        }
        return this;
    }

    public HomePage setChildrenNumber(int number){
        int actualNumber = Integer.parseInt($x(CHILDREN_XPATH).getValue());
        if(actualNumber < number){
            for(int i = 0; i < number-actualNumber; i++){
                $x(INCREASE_CHILDREN_BTN_XPATH).click();
            }
        }
        else if(actualNumber > number){
            for(int i = 0; i < actualNumber-number; i++){
                $x(DECREASE_CHILDREN_BTN_XPATH).click();
            }
        }
        return this;
    }

    public HomePage clickSearchBtn(){
        $x(SEARCH_BTN_XPATH).click();
        return this;
    }
}
