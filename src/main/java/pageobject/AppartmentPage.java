package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AppartmentPage extends BasePage{
    private static final String LOCATION_XPATH = "//span[contains(@class, 'hp_address_subtitle')]";

    public SelenideElement getLocation(){
        return $x(LOCATION_XPATH);
    }
}
