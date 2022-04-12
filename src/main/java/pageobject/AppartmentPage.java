package pageobject;

import static com.codeborne.selenide.Selenide.$x;

public class AppartmentPage extends BasePage{
    private static final String DESTINATION_INPUT_XPATH = "//input[@type='search']";

    public String getDestination(){
        return $x(DESTINATION_INPUT_XPATH).getValue();
    }
}
