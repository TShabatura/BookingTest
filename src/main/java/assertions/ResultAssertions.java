package assertions;

import io.qameta.allure.Step;
import org.testng.Assert;
import pageobject.AppartmentPage;

public class ResultAssertions {
    private AppartmentPage appartmentPage = new AppartmentPage();

    public static ResultAssertions assertThat(){
        return new ResultAssertions();
    }

    @Step
    public ResultAssertions hasDestination(String expected){
        Assert.assertEquals(appartmentPage.getDestination(), expected);
        return this;
    }

}
