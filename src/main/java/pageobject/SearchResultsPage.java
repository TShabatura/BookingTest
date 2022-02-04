package pageobject;

import com.codeborne.selenide.SelenideElement;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class SearchResultsPage extends BasePage{
    private static final String RESULTS_XPATH = "//div[@data-testid = 'property-card']";

    public List<SelenideElement> getResultsList(){
        return $$x(RESULTS_XPATH);
    }

    public void selectResultByNumber(int number){
        getResultsList().get(number).click();
        switchTo().window(1);
    }
}
