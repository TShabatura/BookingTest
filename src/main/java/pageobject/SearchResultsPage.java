package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class SearchResultsPage extends BasePage{
    private static final String RESULTS_XPATH = "//div[@data-testid = 'title']";

    public List<SelenideElement> getResultsList(){
        return $$x(RESULTS_XPATH);
    }

    @Step
    public void selectResultByNumber(int number){
        getResultsList().get(number).click();
        switchTo().window(1);
    }
}
