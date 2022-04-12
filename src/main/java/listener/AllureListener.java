package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import util.AllureAttachments;

public class AllureListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        AllureAttachments.makeScreenshot();
    }
}