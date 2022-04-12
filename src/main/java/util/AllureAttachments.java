package util;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;

public class AllureAttachments {
    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] makeScreenshot(){
        return Selenide.screenshot(OutputType.BYTES);
    }
}
