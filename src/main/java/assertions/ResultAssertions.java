package assertions;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pageobject.AppartmentPage;

public class ResultAssertions {
    private AppartmentPage appartmentPage = new AppartmentPage();

    public static ResultAssertions assertThat(){
        return new ResultAssertions();
    }

    @Step
    public ResultAssertions hasLocation(String expected){
        appartmentPage.getLocation()
                .shouldHave(Condition.text(expected));
        return this;
    }
}
